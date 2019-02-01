package groovy.filters

import org.slf4j.Logger
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import com.netflix.zuul.ZuulFilter;


class TestPreFilter3 extends ZuulFilter {
    private static final Logger logger = LoggerFactory.getLogger(TestPreFilter3.class);

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        logger.info("========= 这一个是动态加载的前置过滤器：TestPreFilter 3");
        return null;
    }

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 5;
    }
}