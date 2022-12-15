package org.example;

import me.whiteship.di.ContainerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final AccountService accountService = ContainerService.getObject(AccountService.class);
        accountService.join();
    }
}
