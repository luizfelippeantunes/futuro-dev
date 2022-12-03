package projeto2.springfox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig extends WebMvcConfigurationSupport {

    @Bean
    public Docket apiDocket(){
        return new Docket(DocumentationType.SWAGGER_2) //Define o tipo de documentação a ser usada
                .select() // retornamos um builder para selecionar os endpoints que devem ser expostos
                .apis(RequestHandlerSelectors.any()) // especificando o que queremos e quais controladores e endpoints que o springfox irá escanear
                .build() //montagem do sumário (Docket)
                .apiInfo(metaData()); //carrega o método metaData
    }

    private ApiInfo metaData(){
        return new ApiInfoBuilder()
                .title("Projeto 2 - API")
                .description("Projeto 2 - API LabShoppingList")
                .version("1.0.0")
                .license("Licenciado por Luiz Felippe Antunes")
                .licenseUrl("https://github.com/luizfelippeantunes")
                .build();
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html") //informamos o arquivo a ser carregador no navegador
                .addResourceLocations("classpath:/META-INF/resources/"); //caminho do arquivo a ser carregado

        registry.addResourceHandler("/webjars/**") //informa outros arquivos necessários (CSS, JS, etc...)
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}