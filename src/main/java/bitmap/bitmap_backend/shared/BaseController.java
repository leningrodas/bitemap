package bitmap.bitmap_backend.shared;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.ehcache.Cache;
import org.springframework.stereotype.Component;

@Component
public class BaseController {

    @Autowired
    protected HttpSession session;

//    @Autowired
//    private Cache<String, BaseForm> cache;

    @Autowired
    private ObjectMapper objectMapper;

//
//    public BaseForm getCacheData(String prefix){
//        return (BaseForm) cache.get(prefix + session.getId());
//    }
//
//    public void putCacheData(String prefix, BaseForm data){
//        cache.remove(prefix + session.getId());
//        cache.put(prefix + session.getId(), data);
//    }
}
