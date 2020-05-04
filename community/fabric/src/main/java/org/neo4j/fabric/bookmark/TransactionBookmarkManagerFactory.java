/*
 * Copyright (c) 2002-2020 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.fabric.bookmark;

import org.neo4j.fabric.FabricDatabaseManager;

/**
 * The main purpose of this factory is to make bookmark logic testable.
 */
public class TransactionBookmarkManagerFactory
{
    private FabricDatabaseManager fabricDatabaseManager;

    public TransactionBookmarkManagerFactory( FabricDatabaseManager fabricDatabaseManager )
    {
        this.fabricDatabaseManager = fabricDatabaseManager;
    }

    public TransactionBookmarkManager createTransactionBookmarkManager( LocalGraphTransactionIdTracker transactionIdTracker )
    {
        // TODO: We will get fabric only bookmarks only when system database supports Fabric
//        if ( fabricDatabaseManager.multiGraphCapabilitiesEnabledForAllDatabases() )
//        {
//            return new FabricOnlyBookmarkManager( transactionIdTracker );
//        }
//        else
//        {
//            return new MixedModeBookmarkManager( transactionIdTracker );
//        }
        return new MixedModeBookmarkManager( transactionIdTracker );
    }
}