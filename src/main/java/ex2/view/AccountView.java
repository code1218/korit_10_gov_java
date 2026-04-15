package ex2.view;

import ex2.Ex2Application;
import ex2.controller.Controller;
import ex2.dto.ResponseDto;
import ex2.entity.Account;
import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

import java.util.List;

public class AccountView implements View {
    private Account currentAccount;

    @Override
    public void render() {
        if (currentAccount == null) {
            ResponseDto<?> accountListResponse = Controller.getAccountListController();
            if (accountListResponse.getStatus() == 400) {
                notFoundAccount(accountListResponse.getData().toString());
                RouterPath.current = Routes.HOME.name();
                return;
            }
            selectAccount((List<Account>) accountListResponse.getData());
            System.out.println("======<< 계좌 ID선택 >>======");
            int selectedId = Integer.parseInt(Input.nextLine());
            ResponseDto<?> response = Controller.selectAccountController(selectedId);
            if (response.getStatus() == 400) {
                notFoundAccount(response.getData().toString());
                return;
            }
            currentAccount = (Account) response.getData();
        }
        accountMenu();
        String cmd = Input.nextLine();
        ResponseDto<?> menuResponse = Controller.accountMenuController(cmd);
        if (menuResponse.getStatus() == 100) {
            currentAccount = null;
            RouterPath.current = Routes.HOME.name();
            return;
        }
        if (menuResponse.getStatus() == 400) {
            menuError(menuResponse.getData().toString());
        }
    }

    private void menuError(String message) {
        System.out.println("======<< MENU ERROR >>======");
        System.out.println("오류 내용[ " + message + "]");
        System.out.println("============================");
        System.out.println();
    }

    private void notFoundAccount(String message) {
        System.out.println("======<< 계좌조회 실패 >>======");
        System.out.println(message);
        System.out.println("=============================");
    }

    private void selectAccount(List<Account> accountList) {
        System.out.println("======<< 계좌목록 >>======");
        System.out.println("| ID |        계좌번호        | 예금주 |");
        accountList.forEach(account -> {
            System.out.printf("| %d | %s | %s |\n", account.getId(), account.getAccountNo(), account.getOwner());
        });
        System.out.println("=========================");
    }

    private void accountMenu() {
        System.out.printf("======<< 선택계좌: %s >>======\n", currentAccount.getAccountNo());
        System.out.println("1. 거래내역조회");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("b. 뒤로가기");
        System.out.println("======================");
        System.out.println();
    }

}














