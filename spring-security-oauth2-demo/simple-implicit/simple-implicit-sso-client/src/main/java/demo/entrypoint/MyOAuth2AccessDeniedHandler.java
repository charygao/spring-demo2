package demo.entrypoint;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: csp
 * @Description: 自定义 资源 无权限处理。
 * @Date: Created in 2019/1/30 下午1:46
 * @Modified By:
 */
public class MyOAuth2AccessDeniedHandler extends OAuth2AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException authException)
        throws IOException, ServletException {
        super.handle(request, response, authException);
    }
}
