package rocketmq01.base;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;

import java.util.concurrent.TimeUnit;

/**
 * 发送异步消息
 * @author lixiaohu
 * @create 2023-12-26 12:55
 */
public class AsyncProducer {
    public static void main(String[] args) throws Exception{
        //        a. 创建消息生产者producer，并制定生产者的组名
        DefaultMQProducer producer = new DefaultMQProducer("group1");

//        b. 指定Nameserver地址
        producer.setNamesrvAddr("192.168.220.101:9876;192.168.220.102:9876");
//        c. 启动producer
        producer.start();
        for (int i = 0; i < 10; i++) {
//        d. 创建消息对象，指定主题Topic、Tag和消息体
            /**
             * 参数1：消息主题topic
             * 参数2：消息tag
             * 参数3：消息内容
             */
            Message message = new Message("RMQ_SYS_TRANS_HALF_TOPIC","tag2",("asynchello word"+i).getBytes());
//        e. 发送消息
            producer.send(message, new SendCallback() {
                //发送成功的回调
                @Override
                public void onSuccess(SendResult sendResult) {
                    System.out.println("sucess");
                    System.out.println(sendResult);
                }
//                发送失败的回调函数
                @Override
                public void onException(Throwable throwable) {
                    System.out.println("发送异常" + throwable);
                }
            });
            TimeUnit.SECONDS.sleep(1);
        }
//        f. 关闭生产者producer
        producer.shutdown();
    }
}
