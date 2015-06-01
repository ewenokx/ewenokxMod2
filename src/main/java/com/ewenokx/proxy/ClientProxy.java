package com.ewenokx.proxy;

import com.ewenokx.Init.items;
import com.ewenokx.Init.blocks;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		blocks.registerRenders();
		items.registerRenders();

		
	}
}
