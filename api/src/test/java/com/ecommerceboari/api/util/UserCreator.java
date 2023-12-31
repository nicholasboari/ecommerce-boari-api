package com.ecommerceboari.api.util;

import com.ecommerceboari.api.dto.CategoryDTO;
import com.ecommerceboari.api.dto.request.UserLoginRequestDTO;
import com.ecommerceboari.api.dto.response.UserResponseDTO;
import com.ecommerceboari.api.model.User;

public class UserCreator {

    public static UserResponseDTO createValidUserResponseDTO() {
        return UserResponseDTO.builder()
                .id(1L)
                .firstName("Nicholas")
                .lastName("Boari")
                .email("nicholas@boari")
                .username("nicholasboari")
                .order(OrderCreator.createValidListOfOrderResponseDTO())
                .address(AddressCreator.createValidAddressDTO())
                .build();
    }

    public static UserResponseDTO createUserResponseDTOWithoutAddress() {
        return UserResponseDTO.builder()
                .id(1L)
                .firstName("Nicholas")
                .lastName("Boari")
                .order(OrderCreator.createValidListOfOrderResponseDTO())
                .build();
    }

    public static CategoryDTO createValidCategoryDTO() {
        return CategoryDTO.builder()
                .id(1L)
                .name("Category A")
                .build();
    }

    public static User createValidUser() {
        return User.builder()
                .id(1L)
                .firstName("Nicholas")
                .lastName("Boari")
                .username("nicholasboari")
                .email("nicholas@boari")
                .order(OrderCreator.createValidListOfOrder())
                .build();
    }

    public static User createValidUserWithoutOrder() {
        return User.builder()
                .id(1L)
                .firstName("Nicholas")
                .lastName("Boari")
                .username("nicholasboari")
                .email("nicholas@boari")
                .build();
    }

    public static UserLoginRequestDTO createValidUserLoginRequestDTO(){
        return UserLoginRequestDTO.builder()
                .email("nicholasboari@gmail.com")
                .password("123")
                .build();
    }
}
