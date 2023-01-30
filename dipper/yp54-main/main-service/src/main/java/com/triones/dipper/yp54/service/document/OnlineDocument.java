package com.triones.dipper.yp54.service.document;

import com.triones.dipper.yp54.api.document.IOnlineDocument;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OnlineDocument implements IOnlineDocument {

    @Override
    public void test() {
        log.info("测试!");
//        OnlineDocumentEntity test = OnlineDocumentEntity.builder().id(1L).description("测试").visitors(new ArrayList<>())
//                .detail(OnlineDocumentDetailEntity.builder().creator(1L)
//                        .createAt(LocalDateTime.now())
//                        .updateAt(LocalDateTime.now()).build())
//                .build();
//        OnlineDocumentEntity insert = mongoTemplate.insert(test);
//        OnlineDocumentEntity byId = mongoTemplate.findById(1, OnlineDocumentEntity.class);
//        log.info("{}", byId);
    }

    @Override
    public void createOnlineDocument() {

    }

    @Override
    public void openPermission() {

    }

    @Override
    public void broadcastChange() {

    }

}
