package com.grice;

import static com.blade.Blade.$;

import com.grice.kit.NodeComparator;

public class Application {
	
	public static final NodeComparator comparator = new NodeComparator();
	
	public static void main(String[] args) throws Exception {
		$().start(Application.class);
	}
	
}
