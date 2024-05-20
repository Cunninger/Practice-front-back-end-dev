//package mychatroom;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.redis.connection.Message;
//import org.springframework.data.redis.connection.MessageListener;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.listener.ChannelTopic;
//import org.springframework.data.redis.listener.RedisMessageListenerContainer;
//import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
//
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//
///**
// * 功能：
// * 日期：2024/5/18 下午4:40
// */
//
//@Controller
//public class ChatController {
//
//    @Autowired
//    private RedisConnectionFactory redisConnectionFactory;
//
//    private final List<SseEmitter> clients = new CopyOnWriteArrayList<>();
//
//
//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }
//
//    @GetMapping("/listen")
//    public SseEmitter listen() {
//        SseEmitter emitter = new SseEmitter();
//        clients.add(emitter);
//        emitter.onCompletion(() -> clients.remove(emitter));
//        emitter.onTimeout(() -> clients.remove(emitter));
//        return emitter;
//    }
//
//    @PostMapping("/send")
//    @ResponseBody
//    public void sendMessage(@RequestParam String message) {
//        redisConnectionFactory.getClusterConnection().publish("chat".getBytes(), message.getBytes());
//
//    }
//
//    // 造频道
//    @Bean
//    RedisMessageListenerContainer redisMessageListenerContainer(MessageListenerAdapter messageListener) {
//        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//        container.setConnectionFactory(redisConnectionFactory);
//        container.addMessageListener(messageListener, new ChannelTopic("chat"));
//        return container;
//    }
//
//
////   MessageListenerAdapter messageListenerAdapter(){
////   return new MessageListenerAdapter(MessageListener)
////
////   }
//
//}