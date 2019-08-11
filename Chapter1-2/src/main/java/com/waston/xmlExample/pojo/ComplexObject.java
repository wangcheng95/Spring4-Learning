package com.waston.xmlExample.pojo;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//这里使用lombok的注解，可以省略getter/setter和toString的写入，代码简洁
@Data
public class ComplexObject {
    private Long id;
    private List<String> list;
    private Map<String, String> map;
    private Properties props;
    private Set<String> set;
    private String[] array;
}
