package lotto_inter;

import java.util.HashSet;

public class lottoMake implements manual{
	HashSet<Integer> lotto;
	
	public void lottomake() {
		lotto = new HashSet<Integer>();
	}

	@Override
	public void  push() {
		while(lotto.size()<6) {
			int num = (int)(Math.random()*45+1);
			 lotto.add(num);  
		}
	}

	@Override
	public void export() {
		System.out.println(lotto);
	}

	public final void lottoMachine(int num) {
		for(int i= 0; i < num; i++) {
			lottomake();
			push();
			export();
		} 
	} 
}
