package template;

import java.util.List;

public class AbstractTemplateImpl extends AbstractTemplate {

	@Override
	protected String getList(List<String> list) {
		// TODO Auto-generated method stub
		return list.get(0);
	}

	@Override
	protected String reconstructLetter(List<String> list, String symmetry) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		if (symmetry.equalsIgnoreCase("NONE")){
			for (int i=5;i<list.size();i++){
				sb.append(list.get(i) + "\n");
			}
		}else if(symmetry.equalsIgnoreCase("VERTICAL")){
			String semiCharLine = "";
			String completeCharLine = "";
			for (int i=5;i<list.size();i++){
				semiCharLine = list.get(i);
				completeCharLine = semiCharLine;
				for(int j=0;j<semiCharLine.length();j++){
					completeCharLine += semiCharLine.charAt(semiCharLine.length()-j-1);
				}
				sb.append(completeCharLine + "\n");
			}
		}else if(symmetry.equalsIgnoreCase("HORIZONTAL")){
			String semiCharLine="";
			String[] completeCharLine=new String[Integer.parseInt(list.get(2).toString())];
			for (int i=5;i<list.size();i++){
				semiCharLine=list.get(i).toString();
				completeCharLine[i-5]=semiCharLine;
				sb.append(semiCharLine + "\n");
			}
			for (int k = completeCharLine.length-1;k>-1;k--){
				sb.append(completeCharLine[k] + "\n");
			}
		}
		
		return sb.toString();
	}

	@Override
	protected void printLetter(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}

}
