package com.pod4.DailyMutualFundNAV;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pod4.dailymutualfundnav.controller.MutualfundController;
import com.pod4.dailymutualfundnav.service.MutualfundService;
@SpringBootTest
public class DailyMutualFundNAVApplicationTest {

	
	@Autowired
    private MutualfundController stockController;
    @Autowired
    private   MutualfundService stockService;
     @Test
     void contextLoads() throws Exception {
            assertThat(stockController).isNotNull();
            assertThat(stockService).isNotNull();
      }
	
}
