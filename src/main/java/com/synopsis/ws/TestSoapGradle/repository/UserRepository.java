package com.synopsis.ws.TestSoapGradle.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.synopsis.ws.TestSoapGradle.user.Address;
import com.synopsis.ws.TestSoapGradle.user.AddressType;
import com.synopsis.ws.TestSoapGradle.user.User;




@Component
public class UserRepository {
	private List<User> usuarios = new ArrayList<>();
	public UserRepository() {
		User u1 = new User();
		u1.setId(1);
		u1.setName("Edgar");
		u1.setEmail("etg.tellogavilan@gmail.com");
		Address a1 = new Address();
		a1.setStreet("heros");
		a1.setCity("San Juan de Miraflores");
		a1.setState("Lima");
		a1.setCountry("Peru");
		a1.setZip(700030);
		a1.setAddressType(AddressType.PERMANENT);
		u1.setAddress(a1);
		
		User u2 = new User();
		u2.setId(2);
		u2.setName("Frank");
		u2.setEmail("frankperez0995@gmail.com");
		Address a2 = new Address();
		a2.setStreet("EEUU");
		a2.setCity("Lurigancho");
		a2.setState("Lima");
		a2.setCountry("Peru");
		a2.setZip(700031);
		a2.setAddressType(AddressType.PERMANENT);
		u2.setAddress(a2);
		
		User u3 = new User();
		u3.setId(3);
		u3.setName("Marcos");
		u3.setEmail("mardostorres@gmail.com");
		Address a3 = new Address();
		a3.setStreet("Avancay");
		a3.setCity("Olivos");
		a3.setState("Lima");
		a3.setCountry("Peru");
		a3.setZip(700032);
		a3.setAddressType(AddressType.PERMANENT);
		u3.setAddress(a3);
		
		usuarios.add(u1);
		usuarios.add(u2);
		usuarios.add(u3);
	}
	
	public List<User> getUsuarios(String name){
		List<User> userList = new ArrayList<>();
		for(User user : usuarios) {
			if(user.getName().toLowerCase().contains(name.toLowerCase())) {
				userList.add(user);
			}
		}
		return userList;
	}
}
