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

    @Override
    public void render() {
        ResponseDto<?> accountListResponse = Controller.getAccountListController();
        if (accountListResponse.getStatus() == 400) {
            notFoundAccount(accountListResponse.getData().toString());
            RouterPath.current = Routes.HOME.name();
            return;
        }
        selectAccount((List<Account>) accountListResponse.getData());
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
        System.out.println("======<< ACCOUNT >>======");
        System.out.println("1. 거래내역조회");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("b. 뒤로가기");
        System.out.println("======================");
        System.out.println();
    }

}














