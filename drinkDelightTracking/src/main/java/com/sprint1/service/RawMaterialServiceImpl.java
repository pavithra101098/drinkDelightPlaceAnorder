package com.sprint1.service;



import com.sprint1.dao.RawMaterialDaoImpl;
//import com.capg.sprint1.service.RawMaterialOrderService;
public class RawMaterialServiceImpl implements RawMaterialService {//4

public String displayOrder(String OrderId) {
RawMaterialDaoImpl rawMaterialOrderDaoImplObj=new RawMaterialDaoImpl();//5

return rawMaterialOrderDaoImplObj.displayOrder(OrderId) ;//19
}

}
