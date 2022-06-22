package com.aerospike.client;

import com.aerospike.client.policy.ClientPolicy;
import com.aerospike.client.policy.Policy;

public class AerospikeTelemetryClient extends AerospikeClient {

	public AerospikeTelemetryClient(ClientPolicy policy, Host... hosts) {
		super(policy, hosts);
	}

	public static void testtest(AerospikeClient c) {
		Record r = test(c);
		System.out.println(r);

		r = test2(c);
		System.out.println(r);
	}

	public static void testtest(AerospikeTelemetryClient tc) {
		Record r = test(tc);
		System.out.println(r);

		r = test2(tc);
		System.out.println(r);
	}

	public static Record test(IAerospikeClient c) {
		return c.get(null, new Key("test", "set", 1));
	}

	public static Record test2(AerospikeClient c) {
		return c.get(null, new Key("test", "set", 1));
	}

	@Override
	public final Record get(Policy policy, Key key) throws AerospikeException {
		// start latency
		Record r = super.get(policy, key);
		// end latency
		return r;
	}

	/*
	public Policy getReadPolicyDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public WritePolicy getWritePolicyDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public ScanPolicy getScanPolicyDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public QueryPolicy getQueryPolicyDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public BatchPolicy getBatchPolicyDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public BatchPolicy getBatchParentPolicyWriteDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public BatchWritePolicy getBatchWritePolicyDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public BatchDeletePolicy getBatchDeletePolicyDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public BatchUDFPolicy getBatchUDFPolicyDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public InfoPolicy getInfoPolicyDefault() {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() {
		// TODO Auto-generated method stub

	}

	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}

	public Node[] getNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getNodeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getNode(String nodeName) throws InvalidNode {
		// TODO Auto-generated method stub
		return null;
	}

	public ClusterStats getClusterStats() {
		// TODO Auto-generated method stub
		return null;
	}

	public Cluster getCluster() {
		// TODO Auto-generated method stub
		return null;
	}

	public void put(WritePolicy policy, Key key, Bin... bins) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void put(EventLoop eventLoop, WriteListener listener, WritePolicy policy, Key key, Bin... bins)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void append(WritePolicy policy, Key key, Bin... bins) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void append(EventLoop eventLoop, WriteListener listener, WritePolicy policy, Key key, Bin... bins)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void prepend(WritePolicy policy, Key key, Bin... bins) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void prepend(EventLoop eventLoop, WriteListener listener, WritePolicy policy, Key key, Bin... bins)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void add(WritePolicy policy, Key key, Bin... bins) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void add(EventLoop eventLoop, WriteListener listener, WritePolicy policy, Key key, Bin... bins)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public boolean delete(WritePolicy policy, Key key) throws AerospikeException {
		// TODO Auto-generated method stub
		return false;
	}

	public void delete(EventLoop eventLoop, DeleteListener listener, WritePolicy policy, Key key)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public BatchResults delete(BatchPolicy batchPolicy, BatchDeletePolicy deletePolicy, Key[] keys)
			throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(EventLoop eventLoop, BatchRecordArrayListener listener, BatchPolicy batchPolicy,
			BatchDeletePolicy deletePolicy, Key[] keys) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void delete(EventLoop eventLoop, BatchRecordSequenceListener listener, BatchPolicy batchPolicy,
			BatchDeletePolicy deletePolicy, Key[] keys) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void truncate(InfoPolicy policy, String ns, String set, Calendar beforeLastUpdate)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void touch(WritePolicy policy, Key key) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void touch(EventLoop eventLoop, WriteListener listener, WritePolicy policy, Key key)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public boolean exists(Policy policy, Key key) throws AerospikeException {
		// TODO Auto-generated method stub
		return false;
	}

	public void exists(EventLoop eventLoop, ExistsListener listener, Policy policy, Key key) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public boolean[] exists(BatchPolicy policy, Key[] keys) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void exists(EventLoop eventLoop, ExistsArrayListener listener, BatchPolicy policy, Key[] keys)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void exists(EventLoop eventLoop, ExistsSequenceListener listener, BatchPolicy policy, Key[] keys)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	@Override
	public final Record get(Policy policy, Key key) throws AerospikeException {
		// start latency
		Record r = client.get(policy, key);
		// end latency
		return r;
	}

	public void get(EventLoop eventLoop, RecordListener listener, Policy policy, Key key) throws AerospikeException {
		// TODO Auto-generated method stub
	}

	public Record get(Policy policy, Key key, String... binNames) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void get(EventLoop eventLoop, RecordListener listener, Policy policy, Key key, String... binNames)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public Record getHeader(Policy policy, Key key) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void getHeader(EventLoop eventLoop, RecordListener listener, Policy policy, Key key)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public boolean get(BatchPolicy policy, List<BatchRead> records) throws AerospikeException {
		// TODO Auto-generated method stub
		return false;
	}

	public void get(EventLoop eventLoop, BatchListListener listener, BatchPolicy policy, List<BatchRead> records)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void get(EventLoop eventLoop, BatchSequenceListener listener, BatchPolicy policy, List<BatchRead> records)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public Record[] get(BatchPolicy policy, Key[] keys) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void get(EventLoop eventLoop, RecordArrayListener listener, BatchPolicy policy, Key[] keys)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void get(EventLoop eventLoop, RecordSequenceListener listener, BatchPolicy policy, Key[] keys)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public Record[] get(BatchPolicy policy, Key[] keys, String... binNames) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void get(EventLoop eventLoop, RecordArrayListener listener, BatchPolicy policy, Key[] keys,
			String... binNames) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void get(EventLoop eventLoop, RecordSequenceListener listener, BatchPolicy policy, Key[] keys,
			String... binNames) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public Record[] get(BatchPolicy policy, Key[] keys, Operation... ops) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void get(EventLoop eventLoop, RecordArrayListener listener, BatchPolicy policy, Key[] keys, Operation... ops)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void get(EventLoop eventLoop, RecordSequenceListener listener, BatchPolicy policy, Key[] keys,
			Operation... ops) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public Record[] getHeader(BatchPolicy policy, Key[] keys) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void getHeader(EventLoop eventLoop, RecordArrayListener listener, BatchPolicy policy, Key[] keys)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void getHeader(EventLoop eventLoop, RecordSequenceListener listener, BatchPolicy policy, Key[] keys)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public Record operate(WritePolicy policy, Key key, Operation... operations) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void operate(EventLoop eventLoop, RecordListener listener, WritePolicy policy, Key key,
			Operation... operations) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public boolean operate(BatchPolicy policy, List<BatchRecord> records) throws AerospikeException {
		// TODO Auto-generated method stub
		return false;
	}

	public void operate(EventLoop eventLoop, BatchOperateListListener listener, BatchPolicy policy,
			List<BatchRecord> records) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void operate(EventLoop eventLoop, BatchRecordSequenceListener listener, BatchPolicy policy,
			List<BatchRecord> records) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public BatchResults operate(BatchPolicy batchPolicy, BatchWritePolicy writePolicy, Key[] keys, Operation... ops)
			throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void operate(EventLoop eventLoop, BatchRecordArrayListener listener, BatchPolicy batchPolicy,
			BatchWritePolicy writePolicy, Key[] keys, Operation... ops) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void operate(EventLoop eventLoop, BatchRecordSequenceListener listener, BatchPolicy batchPolicy,
			BatchWritePolicy writePolicy, Key[] keys, Operation... ops) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void scanAll(ScanPolicy policy, String namespace, String setName, ScanCallback callback, String... binNames)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void scanAll(EventLoop eventLoop, RecordSequenceListener listener, ScanPolicy policy, String namespace,
			String setName, String... binNames) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void scanNode(ScanPolicy policy, String nodeName, String namespace, String setName, ScanCallback callback,
			String... binNames) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void scanNode(ScanPolicy policy, Node node, String namespace, String setName, ScanCallback callback,
			String... binNames) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void scanPartitions(ScanPolicy policy, PartitionFilter partitionFilter, String namespace, String setName,
			ScanCallback callback, String... binNames) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void scanPartitions(EventLoop eventLoop, RecordSequenceListener listener, ScanPolicy policy,
			PartitionFilter partitionFilter, String namespace, String setName, String... binNames)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public RegisterTask register(Policy policy, String clientPath, String serverPath, Language language)
			throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public RegisterTask register(Policy policy, ClassLoader resourceLoader, String resourcePath, String serverPath,
			Language language) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public RegisterTask registerUdfString(Policy policy, String code, String serverPath, Language language)
			throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeUdf(InfoPolicy policy, String serverPath) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public Object execute(WritePolicy policy, Key key, String packageName, String functionName, Value... args)
			throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void execute(EventLoop eventLoop, ExecuteListener listener, WritePolicy policy, Key key, String packageName,
			String functionName, Value... functionArgs) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public BatchResults execute(BatchPolicy batchPolicy, BatchUDFPolicy udfPolicy, Key[] keys, String packageName,
			String functionName, Value... functionArgs) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void execute(EventLoop eventLoop, BatchRecordArrayListener listener, BatchPolicy batchPolicy,
			BatchUDFPolicy udfPolicy, Key[] keys, String packageName, String functionName, Value... functionArgs)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void execute(EventLoop eventLoop, BatchRecordSequenceListener listener, BatchPolicy batchPolicy,
			BatchUDFPolicy udfPolicy, Key[] keys, String packageName, String functionName, Value... functionArgs)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public ExecuteTask execute(WritePolicy policy, Statement statement, String packageName, String functionName,
			Value... functionArgs) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public ExecuteTask execute(WritePolicy policy, Statement statement, Operation... operations)
			throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public RecordSet query(QueryPolicy policy, Statement statement) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void query(EventLoop eventLoop, RecordSequenceListener listener, QueryPolicy policy, Statement statement)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void query(QueryPolicy policy, Statement statement, QueryListener listener) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void query(QueryPolicy policy, Statement statement, PartitionFilter partitionFilter, QueryListener listener)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public RecordSet queryNode(QueryPolicy policy, Statement statement, Node node) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public RecordSet queryPartitions(QueryPolicy policy, Statement statement, PartitionFilter partitionFilter)
			throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void queryPartitions(EventLoop eventLoop, RecordSequenceListener listener, QueryPolicy policy,
			Statement statement, PartitionFilter partitionFilter) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public ResultSet queryAggregate(QueryPolicy policy, Statement statement, String packageName, String functionName,
			Value... functionArgs) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet queryAggregate(QueryPolicy policy, Statement statement) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet queryAggregateNode(QueryPolicy policy, Statement statement, Node node) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public IndexTask createIndex(Policy policy, String namespace, String setName, String indexName, String binName,
			IndexType indexType) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public IndexTask createIndex(Policy policy, String namespace, String setName, String indexName, String binName,
			IndexType indexType, IndexCollectionType indexCollectionType) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void createIndex(EventLoop eventLoop, IndexListener listener, Policy policy, String namespace,
			String setName, String indexName, String binName, IndexType indexType,
			IndexCollectionType indexCollectionType) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public IndexTask dropIndex(Policy policy, String namespace, String setName, String indexName)
			throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void dropIndex(EventLoop eventLoop, IndexListener listener, Policy policy, String namespace, String setName,
			String indexName) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void info(EventLoop eventLoop, InfoListener listener, InfoPolicy policy, Node node, String... commands)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void setXDRFilter(InfoPolicy policy, String datacenter, String namespace, Expression filter)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void createUser(AdminPolicy policy, String user, String password, List<String> roles)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void dropUser(AdminPolicy policy, String user) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void changePassword(AdminPolicy policy, String user, String password) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void grantRoles(AdminPolicy policy, String user, List<String> roles) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void revokeRoles(AdminPolicy policy, String user, List<String> roles) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void createRole(AdminPolicy policy, String roleName, List<Privilege> privileges) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void createRole(AdminPolicy policy, String roleName, List<Privilege> privileges, List<String> whitelist)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void createRole(AdminPolicy policy, String roleName, List<Privilege> privileges, List<String> whitelist,
			int readQuota, int writeQuota) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void dropRole(AdminPolicy policy, String roleName) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void grantPrivileges(AdminPolicy policy, String roleName, List<Privilege> privileges)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void revokePrivileges(AdminPolicy policy, String roleName, List<Privilege> privileges)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void setWhitelist(AdminPolicy policy, String roleName, List<String> whitelist) throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public void setQuotas(AdminPolicy policy, String roleName, int readQuota, int writeQuota)
			throws AerospikeException {
		// TODO Auto-generated method stub

	}

	public User queryUser(AdminPolicy policy, String user) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> queryUsers(AdminPolicy policy) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public Role queryRole(AdminPolicy policy, String roleName) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Role> queryRoles(AdminPolicy policy) throws AerospikeException {
		// TODO Auto-generated method stub
		return null;
	}*/
}
