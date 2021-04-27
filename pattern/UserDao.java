package com.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements Dao<User> {
  private List<User> users = new ArrayList<>();
  public UserDao () {
	  users.add(new User(1,"Gau Gau"));
	  users.add(new User(2,"YSL"));
  }
@Override
public List<User> getAll() {
	// TODO Auto-generated method stub
	return users;
}
@Override
public Optional<User> get(int id) {
	// TODO Auto-generated method stub
	return users.stream().filter(u->  u.getId() == id).findFirst();
}
@Override
public void save(User u) {
	// TODO Auto-generated method stub
	users.add(u);
}
@Override
public void update(User u) {
	// TODO Auto-generated method stub
	get(u.getId()).ifPresent(existUser -> {
        existUser.setName(u.getName());
       
    });
}
@Override
public void delete(User u) {
	// TODO Auto-generated method stub
	 get(u.getId()).ifPresent(existUser -> users.remove(existUser));
}
  
  
  
}
