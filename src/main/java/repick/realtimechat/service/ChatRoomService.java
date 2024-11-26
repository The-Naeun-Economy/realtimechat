package repick.realtimechat.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repick.realtimechat.Request.ChatRoomRequest;
import repick.realtimechat.Response.ChatRoomResponse;
import repick.realtimechat.domain.ChatRoom;

import java.util.UUID;

public interface ChatRoomService {
    ChatRoom createChatRoom(ChatRoomRequest chatRoomRequest);
    ChatRoom findChatRoomByUUID(UUID uuid);
    Page<ChatRoomResponse> getChatRoom(int page, int size);
}
