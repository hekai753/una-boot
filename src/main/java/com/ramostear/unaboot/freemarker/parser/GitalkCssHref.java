package com.ramostear.unaboot.freemarker.parser;

import com.ramostear.unaboot.freemarker.parser.abs.BaseMethod;
import freemarker.template.TemplateModelException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName GitalkCss
 * @Description TODO
 * @Author ramostear
 * @Date 2019/11/22 0022 3:38
 * @Version 1.0
 **/
@Service
public class GitalkCssHref extends BaseMethod {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return "https://cdn.bootcss.com/gitalk/1.5.0/gitalk.css";
    }
}
