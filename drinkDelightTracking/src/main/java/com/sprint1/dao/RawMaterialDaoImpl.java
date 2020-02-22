package com.sprint1.dao;

import java.util.*;


import com.sprint1.model.RawMaterialDetails;



//import com.capg.sprint1.model.RawMaterialOrder;
public class RawMaterialDaoImpl implements RawMaterialDao {//6
	
	
	/*
	 * 
	 * pavithra.a@prepare
	 * @see com.sprint1.dao.RawMaterialDao#displayOrder(java.lang.String)
	 */
public String displayOrder(String OrderId) {
Map<String,RawMaterialDetails> raws =new HashMap<String, RawMaterialDetails>();//7

RawMaterialDetails order=new RawMaterialDetails ("1","Water",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"245");//8
RawMaterialDetails  order1=new RawMaterialDetails ("2","powder",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"459");//9
RawMaterialDetails  order11=new RawMaterialDetails ("3","gas",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"434");//10
RawMaterialDetails  order12=new RawMaterialDetails ("4","flavours",101.4,"128",new Date(), new Date(2020, 11, 20),120.0,140.0,"414");//11
RawMaterialDetails  order13=new RawMaterialDetails ("5","packing",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"404");//12

raws.put(order.getOrderId(), order);//12
raws.put(order1.getOrderId(), order1);//13
raws.put(order11.getOrderId(), order11);//14
raws.put(order12.getOrderId(), order12);//15
raws.put(order13.getOrderId(), order13);//16
//return null;
for(String ord:raws.keySet())//17
{
//System.out.println(raws.toString());
if(raws.get(ord).getOrderId().equalsIgnoreCase(OrderId)){
System.out.println(raws.get(ord));//18
}


}
return null;//19

}}


