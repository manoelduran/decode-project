package com.ead.authuser.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ead.authuser.dtos.UserDto;
import com.ead.authuser.models.UserModel;
import com.ead.authuser.services.UserService;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping
	public ResponseEntity<List<UserModel>> getAllUsers() {
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(userService.findAll());
	}

	@GetMapping("/{userId}")
	public ResponseEntity<?> getOneUser(@PathVariable(value = "userId") UUID userId) {
		Optional<UserModel> userModelOptional = userService.findById(userId);
		
		if(!userModelOptional.isPresent())
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body("User not found");
		
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(userModelOptional.get());
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "userId") UUID userId) {
		Optional<UserModel> userModelOptional = userService.findById(userId);
		
		if(!userModelOptional.isPresent())
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body("User not found");
		
		userService.delete(userModelOptional.get());
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("User deleted success");
	}

	@PutMapping("/{userId}")
	public ResponseEntity<?> updateUser(
			@PathVariable(value = "userId") UUID userId,
			@Validated(UserDto.UserView.UserPut.class) @RequestBody @JsonView(UserDto.UserView.UserPut.class) UserDto userDto
	) {
		Optional<UserModel> userModelOptional = userService.findById(userId);

		if(!userModelOptional.isPresent())
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body("User not found");

		var userModel = userModelOptional.get();
		userModel.setFullName(userDto.getFullName());
		userModel.setPhoneNumber(userDto.getPhoneNumber());
		userModel.setCpf(userDto.getCpf());
		userModel.setLastUpdateDate(LocalDateTime.now(ZoneId.of("UTC")));

		userService.save(userModel);

		return ResponseEntity
				.status(HttpStatus.OK)
				.body(userModel);
	}

	@PatchMapping("/{userId}/password")
	public ResponseEntity<?> updatePassword(
			@PathVariable(value = "userId") UUID userId,
			@RequestBody @Validated(UserDto.UserView.PasswordPut.class) @JsonView(UserDto.UserView.PasswordPut.class) UserDto userDto
	) {
		Optional<UserModel> userModelOptional = userService.findById(userId);

		if(!userModelOptional.isPresent())
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body("User not found.");

		if(!userModelOptional.get().getPassword().equals(userDto.getOldPassword()))
			return ResponseEntity
					.status(HttpStatus.CONFLICT)
					.body("Error: Mismatched old password!");

		var userModel = userModelOptional.get();
		userModel.setPassword(userDto.getPassword());
		userModel.setLastUpdateDate(LocalDateTime.now(ZoneId.of("UTC")));

		userService.save(userModel);

		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Password updated successfully.");
	}

	@PatchMapping("/{userId}/image")
	public ResponseEntity<?> updateImage(
			@PathVariable(value = "userId") UUID userId,
			@RequestBody @Validated(UserDto.UserView.ImagePut.class) @JsonView(UserDto.UserView.ImagePut.class) UserDto userDto
	) {
		Optional<UserModel> userModelOptional = userService.findById(userId);

		if(!userModelOptional.isPresent())
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body("User not found.");

		var userModel = userModelOptional.get();
		userModel.setImageUrl(userDto.getImageUrl());
		userModel.setLastUpdateDate(LocalDateTime.now(ZoneId.of("UTC")));

		userService.save(userModel);

		return ResponseEntity
				.status(HttpStatus.OK)
				.body(userModel);
	}
}