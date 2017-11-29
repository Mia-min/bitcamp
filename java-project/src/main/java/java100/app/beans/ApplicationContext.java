package java100.app.beans;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import java100.app.dao.BoardDao;

public class ApplicationContext {

	HashMap<String, Object> pool = new HashMap<>();

	public ApplicationContext() {

	}

	public ApplicationContext(String propPath) {
		Properties props = new Properties();

		try (FileReader in = new FileReader(propPath)) {
			props.load(in);

			Set<Object> keySet = props.keySet();
			for (Object key : keySet) {
				String name = (String) key;
				Class<?> clazz = Class.forName(props.getProperty(name));

				Object obj = clazz.newInstance();

				pool.put(name, obj);
			}

		} catch (Exception e) {
			throw new BeansException("프로퍼티 파일 로딩 중 오류 발생", e);
		}
	}

	public Object getBean(String name) {
		Object bean = pool.get(name);
		if (bean == null) {
			throw new BeansException("빈을 찾을 수 없음");
		}
		return bean;
	}

	public void addBean(String name, Object bean) {
		pool.put(name, bean);
	}
	
	public String[] getBeanDefinitionNames() {
		Set<String> keySet = pool.keySet();
		
		String[] names = new String[keySet.size()];
		
		keySet.toArray(names);
		
		return names;
	}
	
	public void injectDependency() {
		Collection<Object> objs = pool.values();
		
		for(Object obj : objs) {
			System.out.println(obj.getClass().getName());
			
			Method[] method = obj.getClass().getDeclaredMethods();
			for(Method m : method) {
				if(m.getName().startsWith("set"))
				System.out.printf("=>" + m.getName());
			}
		}
	}
}
