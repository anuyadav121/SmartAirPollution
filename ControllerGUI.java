package gui;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import smart.air.pollution.airquality.*;
import smart.air.pollution.alert.AlertServiceGrpc;
import smart.air.pollution.alert.SubscribeToPollutantAlertsRequest;
import smart.air.pollution.alert.UnsubscribeFromAlertsRequest;
import smart.air.pollution.historicaldata.GetHistoricalDataRequest;
import smart.air.pollution.historicaldata.GetHistoricalDataResponse;
import smart.air.pollution.historicaldata.HistoricalDataServiceGrpc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerGUI implements ActionListener {


	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
	private JTextField entry4, reply4;


	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter location value");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("", 10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("getLatestAirQualityData AirQualityService");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1.setEditable(false);
		panel.add(reply1);

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("", 10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 2");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply2 = new JTextField("", 10);
		reply2.setEditable(false);
		panel.add(reply2);

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService3JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry3 = new JTextField("", 10);
		panel.add(entry3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 3");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply3 = new JTextField("", 10);
		reply3.setEditable(false);
		panel.add(reply3);

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService4JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry4 = new JTextField("", 10);
		panel.add(entry4);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 4");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply4 = new JTextField("", 10);
		reply4.setEditable(false);
		panel.add(reply4);

		panel.setLayout(boxlayout);

		return panel;

	}

	public static void main(String[] args) {

		ControllerGUI gui = new ControllerGUI();

		gui.build();
	}

	private void build() {

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

		panel.add(getService1JPanel());
		panel.add(getService2JPanel());
		panel.add(getService3JPanel());
		panel.add(getService4JPanel());

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	public <SubscribeToPollutantAlerts> void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String label = button.getActionCommand();

		if (label.equals("getLatestAirQualityData AirQualityService")) {
			System.out.println("getLatestAirQualityData AirQualityService ...");

			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			AirQualityServiceGrpc.AirQualityServiceBlockingStub blockingStub = AirQualityServiceGrpc.newBlockingStub(channel);

			//preparing message to send
			GetLatestAirQualityDataRequest request = GetLatestAirQualityDataRequest.newBuilder().setLocation(entry1.getText()).build();

			//retreving reply from service
			GetLatestAirQualityDataResponse response = blockingStub.getLatestAirQualityData(request);

			Pollutant pollutant = response.getPollutants();
			System.out.println(pollutant.getName() + "," + pollutant.getLevel());
			System.out.println(response.getAqi());
			System.out.println(response.getHealthEffects());
			reply1.setText("name:" + pollutant.getName() + ",level:" + pollutant.getLevel() + "aqi:" + response.getAqi() + "Health effects:" + response.getHealthEffects());


			//reply1.setText( String.valueOf( response.getLength()) );

		} else if (label.equals("GetAirQualityDataByTimeRangeRequest")) {
			System.out.println("GetAirQualityDataByTimeRangeRequest ...");

			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			AirQualityServiceGrpc.AirQualityServiceBlockingStub blockingStub = AirQualityServiceGrpc.newBlockingStub(channel);

			//preparing message to send
			GetAirQualityDataByTimeRangeRequest request = GetAirQualityDataByTimeRangeRequest.newBuilder()
					.setLocation
					.getStartTime
					.getEndTime(entry2.getText())
					.build();

			//retreving reply from service
			GetAirQualityDataByTimeRangeResponse response = blockingStub.GetAirQualityDataByTimeRange(request);

			Pollutant pollutant = response.getPollutants();
			System.out.println(pollutant.getName() + "," + pollutant.getLevel());
			System.out.println(response.getAqi());
			System.out.println(response.getTimeStamp());
			reply1.setText("name:" + pollutant.getName() + ",level:" + pollutant.getLevel() + "aqi:" + response.getAqi() + "Time Stamp:" + response.getTimeStamp());


			//reply2.setText( String.valueOf( response.getLength()) );

		} else if (label.equals("SubscribeToPollutantAlertsRequest")) {
			System.out.println("SubscribeToPollutantAlertsRequest ...");

			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			AlertServiceGrpc.AlertServiceBlockingStub blockingStub = AlertServiceGrpc.newBlockingStub(channel);

			//preparing message to send
			SubscribeToPollutantAlertsRequest request = SubscribeToPollutantAlertsRequest.newBuilder().setLocation.getPollutants(entry3.getText()).build();

			//retreving reply from service
			SubscribeToPollutantAlerts response = blockingStub.SubscribeToPollutantAlerts(request);

			Pollutant pollutant;
			pollutant = response.getPollutants();
			System.out.println(pollutant.getName() + "," + pollutant.getLevel());
			reply1.setText("name:" + pollutant.getName() + ",level:" + pollutant.getLevel() + Pollutant.getSubscribeToPollutantAlerts);


			//reply3.setText( String.valueOf( response.getLength()) );


		} else if (label.equals("UnsubscribeFromAlertsRequest")) {
			System.out.println("UnsubscribeFromAlertsRequest ...");


			//preparing message to send
			UnsubscribeFromAlertsRequest request = UnsubscribeFromAlertsRequest.newBuilder().setLocation.getPollutants(entry3.getText()).build();

			//retreving reply from service
			UnsubscribeFromAlerts response = blockingStub.UnsubscribeFromAlertsRequest(request);

			Pollutant pollutant;
			pollutant = response.getPollutants();
			System.out.println(pollutant.getName() + "," + pollutant.getLevel());
			reply1.setText("name:" + pollutant.getName() + ",level:" + pollutant.getLevel() + Pollutant.getUnsubscribeFromAlerts);


		} else {
			boolean historicalDataRequest;
			if (label.equals("GetHistoricalDataRequest")) historicalDataRequest = true;
			else historicalDataRequest = false;
			{
				System.out.println("GetHistoricalDataRequest ...");

				ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
				HistoricalDataServiceGrpc.HistoricalDataServiceBlockingStub blockingStub = HistoricalDataServiceGrpc.newBlockingStub(channel);

				//preparing message to send
				GetHistoricalDataRequest request = GetHistoricalDataRequest.newBuilder().setLocation
						.getStartTime
						.getEndTime(entry2.getText())
						.build();

				//retreving reply from service
				GetHistoricalDataResponse response = blockingStub.GetHistoricalDataResponse(request);

				smart.air.pollution.historicaldata.Pollutant pollutant = response.getPollutants();
				System.out.println(pollutant.getName() + "," + pollutant.getLevel());
				System.out.println(response.getAqi());
				System.out.println(response.getTimeStamp());
				reply1.setText("name:" + pollutant.getName() + ",level:" + pollutant.getLevel() + "aqi:" + response.getAqi() + "Time Stamp:" + response.getTimeStamp());
				//reply4.setText( String.valueOf( response.getLength()) );
			}
		}
	}
}