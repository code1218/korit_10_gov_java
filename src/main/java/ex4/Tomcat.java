package ex4;

public class Tomcat {
    public static void main(String[] args) {
        ServletRequest request = new ServletRequest();
        ServletResponse response = new ServletResponse();
        FilterChain filterChain = new FilterChain();
        filterChain.doFilter(request, response);
    }
}
