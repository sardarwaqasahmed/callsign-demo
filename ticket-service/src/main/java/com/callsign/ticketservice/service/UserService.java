package com.callsign.ticketservice.service;

import com.callsign.ticketservice.entity.UserEntity;
import com.callsign.ticketservice.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
/**
 Author: waqas ahmed
 Date  : APR 14, 2022
 **/
@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    /**
     * Constructor
     *
     * @param userRepository
     */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	UserEntity user = getUserEntiy(userName);
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return user;
    }

    public UserEntity getUserEntiy(String userName) throws UsernameNotFoundException {
        Optional<UserEntity> userOptional = userRepository.findByUserName(userName);
        if (userOptional.isPresent()) {
            return userOptional.get();
        } else {
            throw new UsernameNotFoundException(String.format("User: %s, not found", userName));
        }
    }
}
