/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package com.lealone.plugins.hbase.server;

import com.lealone.server.ProtocolServer;
import com.lealone.server.ProtocolServerEngineBase;

public class HBaseServerEngine extends ProtocolServerEngineBase {

    public static final String NAME = "HBase";

    public HBaseServerEngine() {
        super(NAME);
    }

    @Override
    protected ProtocolServer createProtocolServer() {
        return new HBaseServer();
    }
}
