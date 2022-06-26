package config;

import org.jetbrains.annotations.NotNull;


public class ClientConfig extends CommonConfig
{
    private static final String LOGIN_OPTION_NAME = "Login";
    private static final String PASSWORD_OPTION_NAME = "Password";
    private static final String LOCAL_STORAGE_OPTION_NAME = "LocalStorage";

    private static final String DEFAULT_LOGIN = "user";
    private static final String DEFAULT_PASSWORD = "user";
    private static final String DEFAULT_LOCAL_STORAGE = ".";

    public ClientConfig()
    {
         }

   /* @NotNull
    public String getLogin() {}*/


    /*public void setLogin(final @NotNull String login)
    {
        setStringOption(LOGIN_OPTION_NAME, login, DEFAULT_LOGIN);
    }*/


    /*public String getPassword()
    {

    }*/

    /*public void setPassword(final @NotNull String password)
    {

    }*/


    //public String getLocalStorage ()
    //{        }

        public void setLocalStorage ( final @NotNull String localStorage)
        {

        }
    }