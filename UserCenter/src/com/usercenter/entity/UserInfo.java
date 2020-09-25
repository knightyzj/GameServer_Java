package com.usercenter.entity;

import java.util.Date;

import com.utils.TimeUtil;

/**
 * 用户封装类
 * @author reison
 *
 */
public class UserInfo {
	/**用户id**/
	private int user_id;
	/**gameid**/
	private int game_id;
	/**用户昵称**/
	private String nick_name;
	/**用户手机号**/
	private String phone_no;
	/**用户注册ip**/
	private String register_ip;
	/**用户创建时间**/
	private Date create_time;
	/**用户注册平台**/
	private String register_platform;
	/**用户平台id**/
	private String platform_id;
	/**最近一次登陆时间**/
	private Date last_login_time;
	/**是否在线**/
	private boolean on_line;
	/**最近登陆的服务器**/
	private String last_login_server;
	
	/**
	 * 转换成object数组
	 * @return
	 */
	public Object[] toObjectArray() {
		Object[] oj = new Object[11];
		oj[0] = nick_name;
		oj[1] = phone_no;
		oj[2] = register_ip;
		oj[3] = TimeUtil.getDateFormat(create_time);
		oj[4] = register_platform;
		oj[5] = platform_id;
		oj[6] = TimeUtil.getDateFormat(last_login_time);
		oj[7] = on_line;
		oj[8] = last_login_server;
		oj[9] = user_id;
		oj[10] = game_id;
		return oj;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("user_id:");
		sb.append(user_id);
		sb.append(",");
		sb.append("game_id:");
		sb.append(game_id);
		sb.append(",");
		sb.append("nick_name:");
		sb.append(nick_name);
		sb.append(",");
		sb.append("phone_no:");
		sb.append(phone_no);
		sb.append(",");
		sb.append("register_ip:");
		sb.append(register_ip);
		sb.append(",");
		sb.append("create_time:");
		sb.append(TimeUtil.getDateFormat(create_time));
		sb.append(",");
		sb.append("register_platform:");
		sb.append(register_platform);
		sb.append(",");
		sb.append("platform_id:");
		sb.append(platform_id);
		sb.append(",");
		sb.append("last_login_time:");
		sb.append(last_login_time);
		sb.append(",");
		sb.append("on_line:");
		sb.append(isOn_line());
		sb.append(",");
		sb.append("last_login_server:");
		sb.append(last_login_server);
		return sb.toString();
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getGame_id() {
		return game_id;
	}

	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getRegister_ip() {
		return register_ip;
	}

	public void setRegister_ip(String register_ip) {
		this.register_ip = register_ip;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getRegister_platform() {
		return register_platform;
	}

	public void setRegister_platform(String register_platform) {
		this.register_platform = register_platform;
	}

	public String getPlatform_id() {
		return platform_id;
	}

	public void setPlatform_id(String platform_id) {
		this.platform_id = platform_id;
	}

	public Date getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}

	public boolean isOn_line() {
		return on_line;
	}

	public void setOn_line(boolean on_line) {
		this.on_line = on_line;
	}

	public String getLast_login_server() {
		return last_login_server;
	}

	public void setLast_login_server(String last_login_server) {
		this.last_login_server = last_login_server;
	}
	
}
