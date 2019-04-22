package com.LoadBalance;

import java.rmi.Remote;

public interface UserService extends Remote {
    User login(User user);
    User register(User user);
}
