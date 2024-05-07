package rocketmq01.base;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.concurrent.TimeUnit;

/**
 * @author lixiaohu
 * 发送同步消息
 * @create 2023-12-25 23:27
 */
public class SyncProducer {
    public static void main(String[] args) throws MQClientException, MQBrokerException, RemotingException, InterruptedException {
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
            Message message = new Message("RMQ_SYS_TRANS_HALF_TOPIC","tag1",("hello word"+i).getBytes());
//        e. 发送消息
            SendResult send = producer.send(message);
            SendStatus sendStatus = send.getSendStatus();
            String msgId = send.getMsgId();
            int queueId = send.getMessageQueue().getQueueId();
            System.out.println("发送状态" + sendStatus + ",消息id" + msgId + "，队列" + queueId);
            System.out.println(send);
            TimeUnit.SECONDS.sleep(1);
        }
//        f. 关闭生产者producer
        producer.shutdown();
    }
}
