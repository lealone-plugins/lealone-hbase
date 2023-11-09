/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.hbase.server;

import org.lealone.server.ProtocolServer;
import org.lealone.server.ProtocolServerEngineBase;

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
