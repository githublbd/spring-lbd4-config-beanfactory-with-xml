package com.allen.tinyioc.xml;

import com.allen.tinyioc.BeanDefinition;
import org.junit.Assert;
import org.junit.Test;
import com.allen.tinyioc.io.ResourceLoader;

import java.util.Map;
import java.util.Set;

/**
 * @author yihua.huang@dianping.com
 */
public class XmlBeanDefinitionReaderTest {

	@Test
	public void test() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
		Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
		Assert.assertTrue(registry.size() > 0);

		Set<String> keySet = registry.keySet();
		for( String k : keySet ){
			System.out.println( k + "---" + registry.get( k ) );
		}

		/**
		 * print:
		 * helloWorldService---com.allen.tinyioc.BeanDefinition@25355ef9
		 */
	}
}
