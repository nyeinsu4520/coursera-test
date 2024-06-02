package com.example.demo;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CartItemController {
	@Autowired
	private CartItemRepository cartItemRepository;

	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private MemberRepository memberRepository;

	@GetMapping("/cart")
	public String showCart(Model model, Principal principal) {
		// Get currently logged in user
		MemberDetails memberLoggedIn = (MemberDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		int loggedInID = memberLoggedIn.getMember().getId();
		// Get Shopping cart items added by this user
		// *Hint: You will need to use the method we added in the Cart
		List<CartItem> cartItemList = cartItemRepository.findAllByMemberId(loggedInID);

		// Add the shopping cart items to the model

		double total = 0;
		for (CartItem cartItem : cartItemList) {
			double subtotal = cartItem.getQuantity() * cartItem.getItem().getPrice();
			cartItem.setSubtotal(subtotal);
			total += subtotal;
		}
		model.addAttribute("cartItemList", cartItemList);
		model.addAttribute("total", total);
		return "Cart";

	}

	@PostMapping("/cart/add/{itemId}")
	public String addToCart(@PathVariable("itemId") Integer itemId, @RequestParam("quantity") int quantity,
			Principal principal) { // Get currently logged in user

		MemberDetails memberLoggedIn = (MemberDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		int loggedInID = memberLoggedIn.getMember().getId();

		CartItem cartItem = new CartItem();
		Member member = memberRepository.getReferenceById(loggedInID);
		Item item = itemRepository.getReferenceById(itemId);

		// Check in the cartItemRepository if item was previously added by user.
		// Hint: we will need to write a new method in the CartItemRepository

		List<CartItem> cartItemList = cartItemRepository.findAllByMemberId(loggedInID);

		boolean test = false;
		CartItem ci = new CartItem();
		for (CartItem cartI : cartItemList) {
			if (cartI.getItem().getId() == itemId) {
				test = true;
				ci = cartI;
				break;
			}
		}

		// if the item was previously added, then we get the quantity that was
		// previously added and increase that // save the CartItem object back to the
		// repository

		if (test == true) {
			ci.setQuantity(ci.getQuantity() + quantity);
			cartItemRepository.save(ci);
		}

		else {
			// if the item was NOT previously added, then prepare the item and member
			// objects
			// Create a new CartItem object
			// Set the item and member as well as the new quantity in the new object
			cartItem.setMember(member);
			cartItem.setItem(item);
			cartItem.setQuantity(quantity);
			// Save the new CartItem object to the repository
			cartItemRepository.save(cartItem);
		}

		

		return "redirect:/Cart";

	}

	
	  @PostMapping("/cart/update/{id}") public String
	  updateCart(@PathVariable("id") int cartItemId, @RequestParam("quantity") int qty)
	  {
	  
	  // Get cartItem object by cartItem's id
		  CartItem cartItem=cartItemRepository.getReferenceById(cartItemId);
		  
	  
	  // Set the quantity of the cartItem object retrieved
		  cartItem.setQuantity(qty);
	  
	  // Save the cartItem back to the cartItemRepository
		  cartItemRepository.save(cartItem);
	  
	  return "redirect:/cart"; }
	  
	
	  @GetMapping("/cart/remove/{id}") public String removeCart(@PathVariable("id")
	  int cartItemId) {
	  
	  // Remove item from cartItemRepository
		  CartItem cartItem=cartItemRepository.getReferenceById(cartItemId);
		  cartItemRepository.delete(cartItem);
	  
	  return "redirect:/cart"; }
	 
	 

}
