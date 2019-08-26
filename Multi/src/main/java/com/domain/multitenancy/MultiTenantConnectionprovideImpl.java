package com.domain.multitenancy;

import com.domain.master.MasterService;
import org.hibernate.service.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;
import javax.sql.DataSource;

public class MultiTenantConnectionprovideImpl extends AbstractDataSourceBasedMultiTenantConnectionProviderImpl {
   
	@Override
	protected DataSource selectAnyDataSource() {
        return MasterService.getDataSourceHashMap().get("tenantId1");
    }
	
    @Override
    protected DataSource selectDataSource(String tenantIdentifier) {
        return MasterService.getDataSourceHashMap().get(tenantIdentifier);
    }
}