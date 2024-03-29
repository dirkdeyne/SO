package be.enyed

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import com.google.common.base.Predicates
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun api(): Docket =
		Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
			.build()

}