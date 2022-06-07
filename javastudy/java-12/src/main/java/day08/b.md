组合注解与元注解
为了消除重复注解，在元注解上引入了组合注解，理解为对代码的重构，拥有元注解的原始功能

常用注解：
@Configuration配置spring容器中的bean
@EnableAutoConfiguration启动自动配置,加载到ioc容器中
@ComponentScan 扫描组件，标有@Component或子注解(@Service,@Repository,@Controller)纳入Spring容器进行管理
 Spring MVC中的数据绑定形式：。。。。