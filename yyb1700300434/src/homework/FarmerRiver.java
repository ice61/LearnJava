package homework;

import java.util.LinkedList;


public class FarmerRiver {
	
	public boolean farmerOnRight(int status) {	//判断农夫是否在北岸
		return (0!=(status & 0x08));
	}
	public boolean worfOnRight(int status) {	//狼
		return (0!=(status & 0x04));
	}
	public boolean cabbageOnRight(int status) {	//白菜
		return (0!= (status & 0x02));
	}
	public boolean goatOnRight(int status) {	//羊
		return (0 != (status & 0x01));
	}
	public boolean isSafe(int status) {
		if((cabbageOnRight(status) == goatOnRight(status))
				&& (goatOnRight(status) != farmerOnRight(status)))
			return false;
		if((worfOnRight(status) == goatOnRight(status))
				&& (farmerOnRight(status) != worfOnRight(status)))
			return false;
		return true;
	}
	void farmerRiver() {
		LinkedList<Integer> moveTo = new LinkedList<>();
		int[] status = new int[16];
		for(int i=0;i<status.length;++i)
			status[i] = -1;
		status[0] = 0;
		int nowStatus,newStatus;
		moveTo.add(0x00);
		while(!moveTo.isEmpty() && status[15] == -1) {
			nowStatus = moveTo.getFirst();
			moveTo.removeFirst();
			for(int i=1;i<=8;i*=2) {
				if((0 != (nowStatus & 0x08)) == (0 != (nowStatus & i))) {
					newStatus = nowStatus ^ (0x08|i);
					if(isSafe(newStatus) && status[newStatus] == -1) {
						status[newStatus] = nowStatus;
						//nowStatus = newStatus;
						moveTo.addLast(newStatus);
					}					
				}
			}
		}
		if(status[15] == -1)
			System.out.println("此问题无解");
		else {
			for(int i=15;i!=0;i=status[i]) {
				System.out.println("路径为" + i);
			}
		}
		System.out.println("路径为0");
	}
	
	int def(int nowStatue,int[] statues) {
		int result = 0;
		//如果上一个位置已经到达最终状态，就返回1
		if(nowStatue == 15) {
			System.out.println("路径为：" + nowStatue);
			return 1;
		}
		//测试不同的方法，如果四种方法得到的结果都是0，则返回0代表此路不通
		for(int i=1;i<=8;i*=2) {
			if((0 != (nowStatue & 0x08)) == (0 != (nowStatue & i))) {
				int newStatue = nowStatue ^ (0x08|i);
				if(isSafe(newStatue) && statues[newStatue] == -1) {
					statues[newStatue] = 0;
					result = def(newStatue,statues);
				}
			}
		}
		//如果得到的值是1，代表已经到达了最终状态，开始逆序输出状态
		if(result == 1) {
			System.out.println("路径为：" + nowStatue);
			return 1;
		}else return 0;
	}
	
	
	void dfsAll(int nowStatue,int[] statues) {
		int newStatue = -1;
		//遍历四种方法
		for(int i=1;i<=8;i*=2) {
			//判断农夫和要移动的物品是否在同方向
			if((0 != (nowStatue & 0x08)) == (0 != (nowStatue & i))) {
				//计算移动后的新状态
				newStatue = nowStatue ^ (0x08|i);
				//如果新状态是安全的且不为回头路
				if(isSafe(newStatue) && statues[newStatue] == -1) {
					statues[newStatue] = nowStatue;
					/*如果已经到达终点（新状态为15）则输出路径并将终点重新变成-1
					 * 继续执行循环，尝试从其他节点走到终点
					 */
					if(statues[15] != -1) {
						for(int j=15;j != 0;j=statues[j]) {
							System.out.println("路径为：" + j);
						}
						System.out.println("路径为：0" );
						System.out.println("-------");
						statues[newStatue] = -1;
					//否则调用函数继续搜索新状态的走法
					}else
						dfsAll(newStatue,statues);
				}
			}
		}
		statues[nowStatue] = -1;			
		/*
		 * 所有的情况都尝试后，此节点重新变为-1,返回上一节点
		*因循环继续进行，上一节点不会重复走这一节点，可能会通过其他方向来到达此节点
		 * */
		return;
	}
}
