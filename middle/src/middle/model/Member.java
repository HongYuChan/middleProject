 package middle.model;

import java.io.Serializable;

public class Member implements Serializable{
	private int user_id;
    private String id;
    private String password;
    private String nickname;
    private String email;
    private String phone_number;
    private String address;
    private int holding_coin;
    private int evaluation;
    private String name;
    
    public Member() {
        
    }

    public Member(int user_id, String id, String password, String nickname, String email, String phone_number,
            String address, int holding_coin, int evaluation, String name) {
        super();
        this.user_id = user_id;
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.holding_coin = holding_coin;
        this.evaluation = evaluation;
        this.name = name;
    }

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getHolding_coin() {
		return holding_coin;
	}

	public void setHolding_coin(int holding_coin) {
		this.holding_coin = holding_coin;
	}

	public int getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
