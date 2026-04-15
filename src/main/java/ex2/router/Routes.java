package ex2.router;

import ex2.view.AccountView;
import ex2.view.CreateAccountView;
import ex2.view.HomeView;
import ex2.view.View;
import lombok.Getter;

public enum Routes {
    HOME(new HomeView()),
    CREATE_ACCOUNT(new CreateAccountView()),
    ACCOUNT(new AccountView()),
    DEPOSIT(null),
    WITHDRAWAL(null);

    @Getter
    private View view;

    Routes(View view) {
        this.view = view;
    }
}
