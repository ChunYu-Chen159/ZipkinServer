/*
package ZipkinServer;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Tracer;

@Aspect
@Slf4j
@Component
public class ResponseStatusAspect {
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void requestMapping() {}
    @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
    public void postMapping() {}
    @Pointcut("@annotation(org.springframework.web.bind.annotation.PutMapping)")
    public void putMapping() {}
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void getMapping() {}
    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
    public void deleteMapping() {}
    @Pointcut("@annotation(org.springframework.web.bind.annotation.PatchMapping)")
    public void patchMapping() {}
    // 全局的trace对象
    @Autowired
    Tracer tracer;
    // 针对所有Controller层的方法的切面
    @Around("requestMapping() || postMapping() || putMapping() || getMapping() || deleteMapping() || patchMapping()")
    public Object doSurround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        // 方法的执行结果
        Object result = proceedingJoinPoint.proceed();

        try {
            // 返回值为空的直接跳过
            if(null!=result){
                // 结果转换
                BaseResult baseResult = (BaseResult) result;
                // 判断是否执行成功
                if(!baseResult.isSuccess()){
                    // 执行失败，打上错误标签
                    tracer.addTag("error",baseResult.getErrorMessage());
                }
            }
            // 针对这一块，使用try catch ， 保证不会影响程序的正常运行
        }catch (Exception ignored){}

        return result;
    }
}
*/
