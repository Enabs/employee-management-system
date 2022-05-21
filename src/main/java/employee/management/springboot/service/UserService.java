package employee.management.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import employee.management.springboot.dto.UserRegistrationDto;
import employee.management.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
