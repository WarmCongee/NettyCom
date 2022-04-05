package nio.server;

import io.netty.buffer.ByteBuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 处理服务端 channel.
 */
public class NioServerHandler extends ChannelInboundHandlerAdapter { // (1)
    private static final Logger logger = LoggerFactory.getLogger("InfoLogger");

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
        // 默默地丢弃收到的数据
        //((ByteBuf) msg).release(); // (3)
        ByteBuf byteBuf = (ByteBuf) msg;
        logger.info("server received messages：" + byteBuf.toString(CharsetUtil.UTF_8));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }
}
