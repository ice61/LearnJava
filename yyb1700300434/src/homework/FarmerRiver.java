package homework;

import java.util.LinkedList;


public class FarmerRiver {
	
	public boolean farmerOnRight(int status) {	//�ж�ũ���Ƿ��ڱ���
		return (0!=(status & 0x08));
	}
	public boolean worfOnRight(int status) {	//��
		return (0!=(status & 0x04));
	}
	public boolean cabbageOnRight(int status) {	//�ײ�
		return (0!= (status & 0x02));
	}
	public boolean goatOnRight(int status) {	//��
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
			System.out.println("�������޽�");
		else {
			for(int i=15;i!=0;i=status[i]) {
				System.out.println("·��Ϊ" + i);
			}
		}
		System.out.println("·��Ϊ0");
	}
	
	int def(int nowStatue,int[] statues) {
		int result = 0;
		//�����һ��λ���Ѿ���������״̬���ͷ���1
		if(nowStatue == 15) {
			System.out.println("·��Ϊ��" + nowStatue);
			return 1;
		}
		//���Բ�ͬ�ķ�����������ַ����õ��Ľ������0���򷵻�0�����·��ͨ
		for(int i=1;i<=8;i*=2) {
			if((0 != (nowStatue & 0x08)) == (0 != (nowStatue & i))) {
				int newStatue = nowStatue ^ (0x08|i);
				if(isSafe(newStatue) && statues[newStatue] == -1) {
					statues[newStatue] = 0;
					result = def(newStatue,statues);
				}
			}
		}
		//����õ���ֵ��1�������Ѿ�����������״̬����ʼ�������״̬
		if(result == 1) {
			System.out.println("·��Ϊ��" + nowStatue);
			return 1;
		}else return 0;
	}
	
	
	void dfsAll(int nowStatue,int[] statues) {
		int newStatue = -1;
		//�������ַ���
		for(int i=1;i<=8;i*=2) {
			//�ж�ũ���Ҫ�ƶ�����Ʒ�Ƿ���ͬ����
			if((0 != (nowStatue & 0x08)) == (0 != (nowStatue & i))) {
				//�����ƶ������״̬
				newStatue = nowStatue ^ (0x08|i);
				//�����״̬�ǰ�ȫ���Ҳ�Ϊ��ͷ·
				if(isSafe(newStatue) && statues[newStatue] == -1) {
					statues[newStatue] = nowStatue;
					/*����Ѿ������յ㣨��״̬Ϊ15�������·�������յ����±��-1
					 * ����ִ��ѭ�������Դ������ڵ��ߵ��յ�
					 */
					if(statues[15] != -1) {
						for(int j=15;j != 0;j=statues[j]) {
							System.out.println("·��Ϊ��" + j);
						}
						System.out.println("·��Ϊ��0" );
						System.out.println("-------");
						statues[newStatue] = -1;
					//������ú�������������״̬���߷�
					}else
						dfsAll(newStatue,statues);
				}
			}
		}
		statues[nowStatue] = -1;			
		/*
		 * ���е���������Ժ󣬴˽ڵ����±�Ϊ-1,������һ�ڵ�
		*��ѭ���������У���һ�ڵ㲻���ظ�����һ�ڵ㣬���ܻ�ͨ����������������˽ڵ�
		 * */
		return;
	}
}
