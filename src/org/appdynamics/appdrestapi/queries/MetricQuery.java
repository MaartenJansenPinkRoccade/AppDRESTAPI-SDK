/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.queries;

/**
 *
 * @author soloink
 */
public class MetricQuery {
    protected String baseURL;
    protected String application;

    
    
    public MetricQuery(String baseURL, String application){
        this.baseURL=baseURL;
        this.application=application;
    }
    
    public String queryAgentTierAppAgentAvailability(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryAgentNodeAppAgentAvailability(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeAppAgentAvailability(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryAgentNodeAppAgentAvailability(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierMachineAgentAvailability(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryAgentNodeMachineAgentAvailability( baseURL, application,tier,null,start, end, rollup);
    }
    
    public String queryAgentNodeMachineAgentAvailability(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryAgentNodeMachineAgentAvailability( baseURL, application,tier, node,start, end, rollup);
    }
    
    public String queryAgentTierTopSummaryStatsUploadTopSummaryStatsExceedingLimit(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeTopSummaryStatsUploadTopSummaryStatsExceedingLimit(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTopSummaryStatsExceedingLimit(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierTopSummaryStatsUploadInvalidTopSummaryStats(String tier , long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadInvalidTopSummaryStats(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeTopSummaryStatsUploadInvalidTopSummaryStats(String tier, String node , long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadInvalidTopSummaryStats(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTomSummaryStatsUploadTopSummaryStatsUploaded(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(String tier, String node , long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentTopSummaryStatsUploadTopSummaryStatsTimeSkewErrors(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierDiscoveredBackendsRegistrationSuccessful(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsRegistrationSuccessful(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeDiscoveredBackendsRegistrationSuccessful(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsRegistrationSuccessful(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierDiscoveredBackendsRegistrationFailed(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsRegistrationFailed(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeDiscoveredBackendsRegistrationFailed(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsRegistrationFailed(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierDiscoveredBackendsUnmonitoredCallsPerMinute(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsUnmonitoredCallsPerMinute(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeDiscoveredBackendsUnmonitoredCallsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentDiscoveredBackendsUnmonitoredCallsPerMinute(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierConfigChannelNumberOfApplicationInfrastructureChangeSet(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentConfigChannelNumberOfApplicationInfrastructureChangeSet(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeConfigChannelNumberOfApplicationInfrastructureChangeSet(String tier, String node, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentConfigChannelNumberOfApplicationInfrastructureChangeSet(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryAgentTierSnapshotUploadSnapshotsUploaded(String tier, long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentSnapshotUploadSnapshotsUploaded(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryAgentNodeSnapshotUploadSnapshotsUploaded(String tier, String node , long start, long end, boolean rollup){
        return AgentMetricQuery.queryNodeAgentSnapshotUploadSnapshotsUploaded(baseURL, application, tier, node, start, end, rollup);
    }
    
   public String queryAgentTierSnapshotUploadInvalidSnapshots(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadInvalidSnapshots(baseURL, application, tier, null, start, end, rollup);
   }
    
   public String queryAgentNodeSnapshotUploadInvalidSnapshots(String tier, String node, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadInvalidSnapshots(baseURL, application, tier, node, start, end, rollup);
   }
    
   public String queryAgentTierSnapshotUploadTimeSkewErrors(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadTimeSkewErrors(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeSnapshotUploadTimeSkewErrors(String tier, String node, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadTimeSkewErrors(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierSnapshotUploadSnapshotsExceedingLimit(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadSnapshotsExceedingLimit(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeSnapshotUploadSnapshotsExceedingLimit(String tier, String node, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentSnapshotUploadSnapshotsExceedingLimit(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierMetricUploadRequestsLicenseErrors(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsLicenseErrors(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeMetricUploadRequestsLicenseErrors(String tier, String node , long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsLicenseErrors(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierMetricUploadInvalidMetrics(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadInvalidMetrics(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeMetricUploadInvalidMetrics(String tier, String node , long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadInvalidMetrics(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierMetricUploadRequestsTimeSkewErrors(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsTimeSkewErrors(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeMetricUploadRequestsTimeSkewErrors(String tier, String node , long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsTimeSkewErrors(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierMetricUploadMetricsUpload(String tier,  long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadMetricsUpload(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeMetricUploadMetricsUpload(String tier, String node , long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadMetricsUpload(baseURL, application, tier, node, start, end, rollup);
   }
   
   
   public String queryAgentTierMetricUploadRequestsExceedingLimit(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsExceedingLimit(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeMetricUploadRequestsExceedingLimit(String tier, String node , long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentMetricUploadRequestsExceedingLimit(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierEventUploadEventsUploaded(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadEventsUploaded(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeEventUploadEventsUploaded(String tier, String node , long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadEventsUploaded(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierEventUploadEventsExceedingLimit(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadEventsExceedingLimit(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeEventUploadEventsExceedingLimit(String tier, String node , long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadEventsExceedingLimit(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierEventUploadTimeSkewsErrors(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadTimeSkewsErrors(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeEventUploadTimeSkewsErrors(String tier, String node, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentEventUploadTimeSkewsErrors(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierBusinessTransactionsUnmonitoredCallsPerMinute(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsUnmonitoredCallsPerMinute(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeBusinessTransactionsUnmonitoredCallsPerMinute(String tier, String node, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsUnmonitoredCallsPerMinute(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierBusinessTransactionsRegistrationFailed(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsRegistrationFailed(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeBusinessTransactionsRegistrationFailed(String tier, String node, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsRegistrationFailed(baseURL, application, tier, node, start, end, rollup);
   }
   
   public String queryAgentTierBusinessTransactionsRegistrationSuccessful(String tier, long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsRegistrationSuccessful(baseURL, application, tier, null, start, end, rollup);
   }
   
   public String queryAgentNodeBusinessTransactionsRegistrationSuccessful(String tier, String node , long start, long end, boolean rollup){
       return AgentMetricQuery.queryNodeAgentBusinessTransactionsRegistrationSuccessful(baseURL, application, tier, node, start, end, rollup);
   }
   
   
    
    /* ************************* Hardware Resources CPU *******************************  */
    
    public String queryHWTierCPUAll(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeCPUAll(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeCPUAll(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeCPUAll(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryHWTierCPUBusy(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeCPUBusy(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeCPUBusy(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeCPUBusy(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryHWTierCPUIdle(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeCPUIdle(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeCPUIdle(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeCPUIdle(baseURL, application, tier, node, start, end, rollup);
    }
    
    public String queryHWTierCPUStolen(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeCPUStolen(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeCPUStolen(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeCPUStolen(baseURL, application, tier, node, start, end, rollup);
    }
    
    /* ************************* Hardware Resources Disk *******************************   */
    public String queryHWTierDisksAll(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksAll(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksAll(baseURL, application, tier, null, null, start, end, rollup);
    }
    public String queryHWNodeDisksAll(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksAll(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksAll(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHWTierDisksKBReadPerSec(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksKBReadPerSec(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksKBReadPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    public String queryHWNodeDisksKBReadPerSec(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksKBReadPerSec(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksKBReadPerSec(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHWTierDisksKBWrittenPerSec(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksKBWrittenPerSec(baseURL, application, tier, null, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHWNodeDisksKBWrittenPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeDisksKBWrittenPerSec(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksKBWrittenPerSec(baseURL, application, tier, node,disk,start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksKBWrittenPerSec(baseURL, application, tier, node, null,start, end, rollup);
    }
    
    public String queryHWTierDisksReadPerSec(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksReadPerSec(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksReadPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeDisksReadPerSec(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksReadPerSec(baseURL, application, tier, node,disk,start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksReadPerSec(baseURL, application, tier, node,null,start, end, rollup);
    }
    
    public String queryHWTierDisksWritesPerSec(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksWritesPerSec(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksWritesPerSec(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeDisksWritesPerSec(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksWritesPerSec(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksWritesPerSec(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHWTierDisksSpaceUsed(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksSpaceUsed(baseURL, application, tier, null, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHWNodeDisksSpaceUsed(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeDisksSpaceUsed(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksSpaceUsed(baseURL, application, tier, node, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHWNodeDisksSpaceUsed(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    
    public String queryHWTierDisksAvgServiceTimeMS(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksAvgServiceTimeMS(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksAvgServiceTimeMS(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeDisksAvgServiceTimeMS(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksAvgServiceTimeMS(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksAvgServiceTimeMS(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHWTierDisksPerCPUTime(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksPerCPUTime(baseURL, application, tier, null, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHWNodeDisksPerCPUTime(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeDisksPerCPUTime(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksPerCPUTime(baseURL, application, tier, node, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHWNodeDisksPerCPUTime(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHWTierDisksSpaceAvailable(String tier, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksSpaceAvailable(baseURL, application, tier, null, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksSpaceAvailable(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeDisksSpaceAvailable(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksSpaceAvailable(baseURL, application, tier, node, disk, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeDisksSpaceAvailable(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHWTierDisksAvgQueueTimeMS(String tier,String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksAvgQueueTimeMS(baseURL, application, tier, null, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHWNodeDisksAvgQueueTimeMS(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeDisksAvgQueueTimeMS(String tier, String node, String disk, long start, long end, boolean rollup){
        if(disk != null) return HardwareResourcesMetricQuery.queryHWNodeDisksAvgQueueTimeMS(baseURL, application, tier, node, disk, start, end, rollup);
            return HardwareResourcesMetricQuery.queryHWNodeDisksAvgQueueTimeMS(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    /* ************************* Hardware Resources Memory ******************************* */
    public String queryHWTierVolumesAll(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesAll(baseURL, application, tier, null, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeVolumesAll(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeVolumesAll(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesAll(baseURL, application, tier, node, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeVolumesAll(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHWTierVolumesUsedMB(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesUsedMB(baseURL, application, tier, null, volume, start, end, rollup); 
        return HardwareResourcesMetricQuery.queryHWNodeVolumesUsedMB(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeVolumesUsedMB(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesUsedMB(baseURL, application, tier, node, volume, start, end, rollup); 
        return HardwareResourcesMetricQuery.queryHWNodeVolumesUsedMB(baseURL, application, tier, node, null, start, end, rollup);
    }

    public String queryHWTierVolumesFreeMB(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesFreeMB(baseURL, application, tier, null, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeVolumesFreeMB(baseURL, application, tier, null, null, start, end, rollup);
    }    

    public String queryHWNodeVolumesFreeMB(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesFreeMB(baseURL, application, tier, node, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeVolumesFreeMB(baseURL, application, tier, node, null, start, end, rollup);
    }

    public String queryHWTierVolumesUsedPer(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesUsedPer(baseURL, application, tier, null, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeVolumesUsedPer(baseURL, application, tier, null, null, start, end, rollup);
    }

    public String queryHWNodeVolumesUsedPer(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesUsedPer(baseURL, application, tier, node, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeVolumesUsedPer(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    public String queryHWTierVolumesTotalMB(String tier, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesTotalMB(baseURL, application, tier, null, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeVolumesTotalMB(baseURL, application, tier, null, null, start, end, rollup);
    }
    
    public String queryHWNodeVolumesTotalMB(String tier, String node, String volume, long start, long end, boolean rollup){
        if(volume != null) return HardwareResourcesMetricQuery.queryHWNodeVolumesTotalMB(baseURL, application, tier, node, volume, start, end, rollup);
        return HardwareResourcesMetricQuery.queryHWNodeVolumesTotalMB(baseURL, application, tier, node, null, start, end, rollup);
    }
    
    /* ************************* Hardware Resources Memory *******************************   */
    
    public String queryHWTierMemoryAll(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryAll(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeMemoryAll(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHWTierMemoryFreePerc(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryFreePerc(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeMemoryFreePerc(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryFreePerc(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHWTierMemoryFreeMB(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryFreeMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeMemoryFreeMB(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryFreeMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHWTierMemoryTotalMB(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryTotalMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeMemoryTotalMB(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryTotalMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHWTierMemoryUsedPerc(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryUsedPerc(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeMemoryUsedPerc(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryUsedPerc(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHWTierMemoryUsedMB(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryUsedMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryHWNodeMemoryUsedMB(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeMemoryUsedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* ************************* Hardware Resources Network *******************************   */
    
    public String queryHWTierNetworkAll(String tier, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkAll(baseURL, application, tier, null, obj, start, end, rollup);
    }
    
    public String queryHWNodeNetworkAll(String tier, String node, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkAll(baseURL, application, tier, node, obj, start, end, rollup);
    }
    
    public String queryHWTierNetworkIncomingKB(String tier, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkIncomingKB(baseURL, application, tier, null, obj, start, end, rollup);
    }
    
    public String queryHWNodeNetworkIncomingKB(String tier, String node, String obj, long start, long end, boolean rollup){
       
        return HardwareResourcesMetricQuery.queryHWNodeNetworkIncomingKB(baseURL, application, tier, node, obj, start, end, rollup);
    }
    
    public String queryHWTierNetworkIncomingKBPerSec(String tier, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkIncomingKBPerSec(baseURL, application, tier, null, obj, start, end, rollup);
    }
    
    public String queryHWNodeNetworkIncomingKBPerSec(String tier, String node, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkIncomingKBPerSec(baseURL, application, tier, node, obj, start, end, rollup);
    }
    
    public String queryHWTierNetworkIncomingPackets(String tier, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkIncomingPackets(baseURL, application, tier, null, obj, start, end, rollup);
    }
    
    public String queryHWNodeNetworkIncomingPackets(String tier, String node, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkIncomingPackets(baseURL, application, tier, node, obj, start, end, rollup);
    }
    
    public String queryHWTierNetworkIncomingPacketsPerSec(String tier, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkIncomingPacketsPerSec(baseURL, application, tier, null, obj, start, end, rollup);
    }
    
    public String queryHWNodeNetworkIncomingPacketsPerSec(String tier, String node, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkIncomingPacketsPerSec(baseURL, application, tier, node, obj, start, end, rollup);
    }
    
    public String queryHWTierNetworkOutgoingKB(String tier, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkOutgoingKB(baseURL, application, tier, null, obj, start, end, rollup);
    }
    
    public String queryHWNodeNetworkOutgoingKB(String tier, String node, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkOutgoingKB(baseURL, application, tier, node, obj, start, end, rollup);
    }
    
    public String queryHWTierNetworkOutgoingKBPerSec(String tier, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkOutgoingKBPerSec(baseURL, application, tier, null, obj, start, end, rollup);
    }
    
    public String queryHWNodeNetworkOutgoingKBPerSec(String tier, String node, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkOutgoingKBPerSec(baseURL, application, tier, node, obj, start, end, rollup);
    }
    
    public String queryHWTierNetworkOutgoingPackets(String tier, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkOutgoingPackets(baseURL, application, tier, null, obj, start, end, rollup);
    }
    
    public String queryHWNodeNetworkOutgoingPackets(String tier, String node, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkOutgoingPackets(baseURL, application, tier, node, obj, start, end, rollup);
    }
    
    public String queryHWTierNetworkOutgoingPacketsPerSec(String tier, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkOutgoingPacketsPerSec(baseURL, application, tier, null, obj, start, end, rollup);
    }
    
    public String queryHWNodeNetworkOutgoingPacketsPerSec(String tier, String node, String obj, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeNetworkOutgoingPacketsPerSec(baseURL, application, tier, node, obj, start, end, rollup);
    }
    
    /* Hardware Resources System */
    public String queryHWTierSystemAll(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWTierSystemAll(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryHWNodeSystemAll(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeSystemAll(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryHWTierSystemRQ(String tier, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWTierSystemRQ(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryHWNodeSystemRQ(String tier, String node, long start, long end, boolean rollup){
        return HardwareResourcesMetricQuery.queryHWNodeSystemRQ(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* ******************************  JVM metrics *************************************************************** */

      /* ************************************* Classes|CurrentLoaded ********************************************* */

    public String queryJVMTierClassesALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeClassesALL( baseURL, application, tier, null, start, end, rollup);
    }

    public String queryJVMNodeClassesALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeClassesALL( baseURL, application, tier, node, start, end, rollup);
    }

    public String queryJVMTierClassesCurrentLoadedClassCount(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeClassesCurrentLoadedClassCount( baseURL, application, tier, null, start, end, rollup);
    }

    public String queryJVMNodeClassesCurrentLoadedClassCount(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeClassesCurrentLoadedClassCount( baseURL, application, tier, node, start, end, rollup);
    }

    public String queryJVMTierClassesTotalClassesLoaded(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeClassesTotalClassesLoaded( baseURL, application, tier, null, start, end, rollup);
    }

    public String queryJVMNodeClassesTotalClassesLoaded(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeClassesTotalClassesLoaded( baseURL, application, tier, node, start, end, rollup);
    }
    
      /* ********************************* CPU ***************************************************************** */
    public String queryJVMTierProcessCPUALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeProcessCPUALL(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeProcessCPUALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeProcessCPUALL(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierProcessCPUBurntMSPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeProcessCPUBurntMSPerMin(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeProcessCPUBurntMSPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeProcessCPUBurntMSPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierProcessCPUUsagePerc(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeProcessCPUUsagePerc(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeProcessCPUUsagePerc(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeProcessCPUUsagePerc(baseURL, application, tier, node,start, end, rollup);
    }

    /* JVM Garbage Collections Memory Pools Code Cache*/
    public String queryJVMTierGarbageCollectionMemoryPoolsCodeCacheALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheALL(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheALL(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCodeCacheMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    /* JVM Garbage Collections Memory Pools PS Eden Space */
    public String queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceALL(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceALL(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsEdenSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* JVM Garbage Collections Memory Pools PS Old Gen */
    public String queryJVMTierGarbageCollectionMemoryPoolsPsOldGenALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenALL(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenALL(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsOldGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    /* JVM Garbage Collection Memory Pools PS Perm Gen */
    public String queryJVMTierGarbageCollectionMemoryPoolsPsPermGenALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenALL(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenALL(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsPermGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
          /* JVM Garbage Collections Memory Pools PS Survivor Space */
    public String queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceALL(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceALL(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceCurrentUsage(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPsSurvivorSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    /* JVM Garbage Collections */
    public String queryJVMTierGarbageCollectionALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionALL(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionALL(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionGCTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionGCTimeSpentPerMin(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionGCTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionGCTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMajorCollectionTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMajorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionMinorCollectionTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMinorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionNumberOfMajorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionNumberOfMinorCollectionTimeSpentPerMin(baseURL, application, tier, node,start, end, rollup);
    }


    public String queryJVMTierGarbageCollectionMemoryPoolsParEdenSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceALL(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsParEdenSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsParEdenSpaceCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsParEdenSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParEdenSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // G1EdenSpace

    public String queryJVMNTierGarbageCollectionMemoryPoolsG1EdenSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceALL(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsG1EdenSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsG1EdenSpaceCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsG1EdenSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1EdenSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }
    // Tenured


    public String queryJVMTierGarbageCollectionMemoryPoolsTenuredGenALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenALL(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsTenuredGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsTenuredGenCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsTenuredGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsTenuredGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // Compressed Class Space

    public String queryJVMTierGarbageCollectionMemoryPoolsCompressedClassSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceALL(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsCompressedClassSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsCompressedClassSpaceCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsCompressedClassSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCompressedClassSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // Nursery

    public String queryJVMTierGarbageCollectionMemoryPoolsNurseryALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsNurseryALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsNurseryALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsNurseryALL(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsNurseryCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsNurseryCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsNurseryCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsNurseryCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsNurseryCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsNurseryCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsNurseryCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsNurseryCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsNurseryMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsNurseryMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsNurseryMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsNurseryMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // EdenSpace

    public String queryJVMTierGarbageCollectionMemoryPoolsEdenSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceALL(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsEdenSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsEdenSpaceCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsEdenSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsEdenSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    //CMSPermGen

    public String queryJVMTierGarbageCollectionMemoryPoolsCMSPermGenALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenALL(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsCMSPermGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsCMSPermGenCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsCMSPermGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSPermGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // G1PermGen

    public String queryJVMTierGarbageCollectionMemoryPoolsG1PermGenALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenALL(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsG1PermGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsG1PermGenCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsG1PermGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1PermGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // ParSurvivorSpace

    public String queryJVMTierGarbageCollectionMemoryPoolsParSurvivorSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceALL(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsParSurvivorSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsParSurvivorSpaceCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }

    public String queryJVMTierGarbageCollectionMemoryPoolsParSurvivorSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsParSurvivorSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }


    //G1SurviroSpace

    public String queryJVMTierGarbageCollectionMemoryPoolsG1SurvivorSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceALL(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsG1SurvivorSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsG1SurvivorSpaceCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsG1SurvivorSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1SurvivorSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // PermGen


    public String queryJVMTierGarbageCollectionMemoryPoolsPermGenALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPermGenALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsPermGenALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPermGenALL(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsPermGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPermGenCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsPermGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPermGenCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsPermGenCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPermGenCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsPermGenCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPermGenCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsPermGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPermGenMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsPermGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsPermGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    //SurvivorSpace

    public String queryJVMTierGarbageCollectionMemoryPoolsSurvivorSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceALL(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsSurvivorSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsSurvivorSpaceCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsSurvivorSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsSurvivorSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // OldSpace


    public String queryJVMTierGarbageCollectionMemoryPoolsOldSpaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceALL(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsOldSpaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsOldSpaceCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsOldSpaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsOldSpaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // CMSOldGen


    public String queryJVMTierGarbageCollectionMemoryPoolsCMSOldGenALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenALL(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsCMSOldGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsCMSOldGenCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsCMSOldGenGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenGenMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsCMSOldGenGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // Metaspace


    public String queryJVMTierGarbageCollectionMemoryPoolsMetaspaceALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceALL(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsMetaspaceCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsMetaspaceCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsMetaspaceMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsMetaspaceMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // G1OldGen


    public String queryJVMTierGarbageCollectionMemoryPoolsG1OldGenALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenALL(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsG1OldGenCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsG1OldGenCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsG1OldGenMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsG1OldGenMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }


    // ClassBlockMemory


    public String queryJVMTierGarbageCollectionMemoryPoolsClassBlockMemoryALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryALL(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsClassBlockMemoryCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsClassBlockMemoryCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsClassBlockMemoryMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassBlockMemoryMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }

    // ClassMemory


    public String queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryALL(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryALL(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsClassMemoryCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCommittedMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCommittedMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsClassMemoryCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCurrentUsageMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);

    }


    public String queryJVMTierGarbageCollectionMemoryPoolsClassMemoryMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryMaxAvailableMB(baseURL, application, tier, null,start, end, rollup);
    }

    public String queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeGarbageCollectionMemoryPoolsClassMemoryMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);

    }
    
    /* JVM Memory Heap */
    public String queryJVMTierMemoryHeapALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapALL(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapALL(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryHeapCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapCommittedMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryHeapCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapCurrentUsageMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryHeapMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapMaxAvailableMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryHeapUsedPerc(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapUsedPerc(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryHeapUsedPerc(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryHeapUsedPerc(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* JVM Memory Non-Heap */
    public String queryJVMTierMemoryNonHeapALL(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapALL(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapALL(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapALL(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryNonHeapCommittedMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCommittedMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapCommittedMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCommittedMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryNonHeapCurrentUsageMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCurrentUsageMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapCurrentUsageMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapCurrentUsageMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryNonHeapMaxAvailableMB(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapMaxAvailableMB(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapMaxAvailableMB(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapMaxAvailableMB(baseURL, application, tier, node,start, end, rollup);
    }
    
    public String queryJVMTierMemoryNonHeapUsedPerc(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapUsedPerc(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeMemoryNonHeapUsedPerc(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeMemoryNonHeapUsedPerc(baseURL, application, tier, node,start, end, rollup);
    }
    
    /* JVM Threads */
    public String queryJVMTierThreadsCurrentNoOfThreads(String tier, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeCurrentNoOfThreads(baseURL, application, tier, null, start, end, rollup);
    }
    
    public String queryJVMNodeThreadsCurrentNoOfThreads(String tier, String node, long start, long end, boolean rollup){
        return JVMMetricQuery.queryJVMNodeCurrentNoOfThreads(baseURL, application, tier, node,start, end, rollup);
    }
    
    /*  Overall Application Performance */
    
    public String queryOAPNodeAll(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeAll(baseURL, application, tier, node, start, end, rollup);
    }
    
    
    //Stall Count
    public String queryOAPNodeStallCount(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeStallCount(baseURL, application, tier, node, start, end, rollup);
    }
    
    //Number of Very Slow Call
    public String queryOAPNodeNumberOfVerySlowCalls(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeNumberOfVerySlowCalls(baseURL, application, tier, node, start, end, rollup);
    }
    //Number of Slow Calls
    public String queryOAPNodeNumberOfSlowCalls(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeNumberOfSlowCalls(baseURL, application, tier, node, start, end, rollup);
    }
    //Infrastructure Errors per Minute
    public String queryOAPNodeInfrastructureErrorsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeInfrastructureErrorsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    //HTTP Error Codes per Minute
    public String queryOAPNodeHttpErrorCodesPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeHttpErrorCodesPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    //Exceptions per Minute
    public String queryOAPNodeExceptionsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeExceptionsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    
    //Errors per Minute
    public String queryOAPNodeErrorsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeErrorsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    
    //Error Page Redirects per Minute
    public String queryOAPNodeErrorPageRedirectsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeErrorPageRedirectsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
    //CallsPerMinute
    public String queryOAPNodeCallsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeCallsPerMinute(baseURL, application,tier,node,start, end, rollup);
    }
     // Avg Response Time  
    public String queryOAPNodeAvgResponseTimeMS(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeAvgResponseTimeMS(baseURL, application,tier,node,start, end, rollup);
    }
    
    public String queryOAPNodeExternalCallsAll(String tier, String node, String obj, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeExternalCallsAll(baseURL,application,tier,node,obj,start,end,rollup);
    }
    
    public String queryOAPNodeExternalCallsCallsPerMinute(String tier, String node, String obj, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeExternalCallsCallsPerMinute(baseURL,application,tier,node,obj,start,end,rollup);
    }
    
    public String queryOAPNodeExternalCallsErrorsPerMinute(String tier, String node, String obj, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeExternalCallsErrorsPerMinute(baseURL,application,tier,node,obj,start,end,rollup);
    }
    
    public String queryOAPNodeExternalCallsAverageResponseTimeMS(String tier, String node, String obj, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeExternalCallsAverageResponseTimeMS(baseURL,application,tier,node,obj,start,end,rollup);
    }
    
    public String queryOAPNodeThreadTasksLicenseFileTrackerCallsPerMinute(String tier, String node, long start, long end, boolean rollup){
        return OverAllPerformanceMetricQuery.queryOAPNodeThreadTasksLicenseFileTrackerCallsPerMinute(baseURL,application,tier,node,start,end,rollup);
    }
    
    /* EUM AJAX */
    public String queryEUM_AJAX_All(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_All(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_REQUESTS_PER_MIN(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_REQUESTS_PER_MIN(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_REQUESTS_ERRORS_PER_MIN(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_DOC_DOWNLOAD_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_DOC_DOWNLOAD_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_DOC_PROCESSING_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_DOC_PROCESSING_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_APPLICATION_SERVER_CALLS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_APPLICATION_SERVER_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_APPLICATION_SERVER_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_AJAX_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    
    /* EUM BASE PAGES */
    public String queryEUM_BASE_PAGES_All(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_All(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FRONT_END_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FRONT_END_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_PAGE_RENDER_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_RESPONSE_AVAILABLE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_SERVER_CONNECTION_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_SYNTHETIC_REQUESTS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_REQUESTS_PER_MIN(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_REQUESTS_PER_MIN(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOC_READY_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOC_READY_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOC_DOWNLOAD_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOC_PROCESSING_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_TCP_CONNECT_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_APPLICATION_SERVER_CALLS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_SSL_HANDSHAKE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_APPLICATION_SERVER_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOMAIN_LOOKUP_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_BASE_PAGES_DOM_READY_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_All(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_All(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FRONT_END_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FRONT_END_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOCUMENT_READY_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOCUMENT_READY_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_TCP_CONNECT_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_TCP_CONNECT_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOMAIN_LOOKUP_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_RESPONSE_AVAILABLE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_SERVER_CONNECTION_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_PAGE_RENDER_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_PAGE_RENDER_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_PAGE_VIEWS_WITH_JAVASCRIPT_ERRORS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOCUMENT_DOWNLOAD_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOCUMENT_PROCESSING_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_SSL_HANDSHAKE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_REQUESTS_PER_MINUTE(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_REQUESTS_PER_MINUTE(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_FIRST_BYTE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_END_USER_RESPONSE_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_50TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_90TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_95TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    public String queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS(String urlPath, long start, long end, boolean rollup){
        return EUMMetricQuery.queryEUM_IFRAME_DOM_READY_TIME_99TH_PERCENTILE_MS(baseURL, application, urlPath, start, end, rollup);
    }
    
    
    /*
     *  ***********************************************************************
     *    Business Transaction Metric Querys 
     */
    public String queryBTAVERAGE_BLOCK_TIME_MS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_BLOCK_TIME_MS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTAVERAGE_CPU_USED_MS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_CPU_USED_MS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTAVERAGE_REQUEST_SIZE(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_REQUEST_SIZE(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTAVERAGE_RESPONSE_TIME(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_RESPONSE_TIME(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTAVERAGE_WAIT_TIME_MS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTAVERAGE_WAIT_TIME_MS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTCALL_PER_MINUTE(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTCALL_PER_MINUTE(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTERRORS_PER_MINUTE(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTERRORS_PER_MINUTE(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTNORMAL_AVERAGE_RESPONSE_TIME_MS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTNUMBER_OF_SLOW_CALLS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTNUMBER_OF_SLOW_CALLS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTNUMBER_OF_VERY_SLOW_CALLS(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTNUMBER_OF_VERY_SLOW_CALLS(baseURL, application, tier, site, start, end, rollup);
    }
    
    public String queryBTSTALL_COUNT(String application, String tier, String site, long start, long end, boolean rollup){
        return BusinessTransactionQuery.queryBTSTALL_COUNT(baseURL, application, tier, site, start, end, rollup);
    }
    
    /* Added Hugh Brian */
    public String queryAllMetricsForBT( String application, String tier, String btName, long start, long end, boolean rollup)
    {
        return BusinessTransactionQuery.queryAllMetricsPerBT( baseURL,  application,  tier, btName,  start,  end,  rollup);
    }
    
    /*
     * *************************************************************************
     *              Backends 
     */
    
    public String queryBackendAverageResponseTimeMS(String application, String tier, long start, long end, boolean rollup){
        return BackendsQuery.queryBackendAverageResponseTimeMS(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryBackendCallsPerMinute(String application, String tier, long start, long end, boolean rollup){
        return BackendsQuery.queryBackendCallsPerMinute(baseURL, application, tier, start, end, rollup);
    }
    
    public String queryBackendErrorsPerMinute(String application, String tier, long start, long end, boolean rollup){
        return BackendsQuery.queryBackendErrorsPerMinute(baseURL, application, tier, start, end, rollup);
    }
    
}
