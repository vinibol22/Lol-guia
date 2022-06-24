package br.com.apostas.modules;

import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import br.com.apostas.modules.domain.repositories.UsuarioRepositories;

@SpringBootApplication
/*@EnableAutoConfiguration
@ComponentScan(basePackages={"br.com.apostas.modules"})
@EnableJpaRepositories(basePackages=" br.com.apostas.modules.domain.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="br.com.apostas.modules.datasources.models")*/
public class ApostasConcienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApostasConcienteApplication.class, args);
	}

	/*@Bean
	BeanFactoryPostProcessor beanFactoryPostProcessor(ApplicationContext beanRegistry) {
		return beanFactory -> {
			genericApplicationContext(
					(BeanDefinitionRegistry) ((AnnotationConfigServletWebServerApplicationContext) beanRegistry)
							.getBeanFactory());
		};
	}

	void genericApplicationContext(BeanDefinitionRegistry beanRegistry) {
		ClassPathBeanDefinitionScanner beanDefinitionScanner = new ClassPathBeanDefinitionScanner(beanRegistry);
		beanDefinitionScanner.addIncludeFilter(removeModelAndEntitiesFilter());
		beanDefinitionScanner.scan("br.com.apostas.modules");
	}

	static TypeFilter removeModelAndEntitiesFilter() {
		return (MetadataReader mr,
				MetadataReaderFactory mrf) -> !mr.getClassMetadata().getClassName().endsWith("Model");
	}*/

}
