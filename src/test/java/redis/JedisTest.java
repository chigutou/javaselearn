package redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import redis.clients.jedis.Jedis;
import redislearn.util.JedisConnectionFactory;

import java.util.Map;

/**
 * @author lixiaohu
 * @create 2023-11-18 15:56
 */
public class JedisTest {
    private Jedis jedis;

    @Before
    public void setUp(){
        //建立连接
        jedis = new Jedis("192.168.220.104",6379);
        //设置密码
        jedis.auth("123321");
        //选择库
        jedis.select(0);

        //通过连接池获取连接对象
        jedis = JedisConnectionFactory.getJedis();
    }
    @Test
    public void testString(){
        String result = jedis.set("user:name","tiger");
        System.out.println(result);
        String name = jedis.get("user:name");
        System.out.println("name=" + name);
    }

    @Test
    public void testHash(){
        jedis.hset("user:0","name","lixiaohu");
        jedis.hset("user:0","age","24");
        jedis.hset("user:0","like","game");
        Map<String, String> user0Map = jedis.hgetAll("user:0");
        user0Map.forEach((key,value) -> {
            System.out.println(key + "=" + value);
        });
    }

    @After
    public void tearDown(){
        if(jedis != null){
            jedis.close();
        }
    }

}
