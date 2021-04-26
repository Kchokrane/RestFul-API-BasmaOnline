package org.basma.store;

import org.basma.store.services.UserService;
import org.basma.store.shared.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasmaStoreApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		if (userService == null)
			System.out.println("null");
		else {
			System.out.println("nadi");
			UserDto userDto = new UserDto("chokrane", "chokrane", "youcode@email.com","aaa");

			userService.createUser(userDto);
		}
	}

}

