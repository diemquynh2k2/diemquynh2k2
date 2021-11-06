/*package com.example.demo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class UserViewmodel extends ViewModel {
    private MutableLiveData<List<User>> ListUserliveData;
    private List<User> userList;

    public UserViewmodel() {
        ListUserliveData = new MutableLiveData<>();
        initdata();

    }

    private void initdata() {

           userList = new ArrayList<>();
           userList.add(new User(R.drawable.ban,"Bàn 1"));
           userList.add(new User(R.drawable.ban,"Bàn 2"));
       /* userList.add(new User(R.drawable.ban,"Bàn 3"));
        userList.add(new User(R.drawable.ban,"Bàn 4"));
        userList.add(new User(R.drawable.ban,"Bàn 5"));
        userList.add(new User(R.drawable.ban,"Bàn 6"));*/

       /* ListUserliveData.setValue(userList);

        }

    public MutableLiveData<List<User>> getListUserliveData() {
        return ListUserliveData;
    }
    public  void addtable(User user)
    {
        userList.add(user);
        ListUserliveData.setValue((userList));
    }
}*/

